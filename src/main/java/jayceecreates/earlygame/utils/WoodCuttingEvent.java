package jayceecreates.earlygame.utils;

import jayceecreates.earlygame.EarlyGame;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.BlockTags;

public class WoodCuttingEvent {

    private static final Random RANDOM = new Random();

    public static void chopEvent() {
        
        UseBlockCallback.EVENT.register((player, world, hand, block) -> {
            ItemStack stack = player.getStackInHand(hand);
            BlockPos pos = block.getBlockPos();
            BlockState state = world.getBlockState(pos);

            double r1 = RANDOM.nextDouble();
            int r2 = 0;

            boolean
                isAxe = player.inventory.getMainHandStack().getItem().isIn(FabricToolTags.AXES),
                isSaw = player.inventory.getMainHandStack().getItem().isIn(ModItemTags.SAWS),
                isLog = state.getBlock().isIn(BlockTags.LOGS),
                isPlank = state.getBlock().isIn(BlockTags.PLANKS);

            if (state == null || player == null)
                return ActionResult.PASS;

                if (isAxe && (isLog || isPlank) && block.getSide() == Direction.UP && player.isSneaking()) {
                    if (!world.isClient) {
                        if (r1 <= EarlyGame.CONFIG.woodChoppingProb) {
                            world.breakBlock(pos, false);
                            ItemEntity itemEntity = null;
                            if (isLog) {
                                r2 = isSaw ? 4 : RANDOM.nextInt(3) + 2;
    
                                for (Block obj : BlockTags.LOGS.values()) {
                                    if (state.getBlock() == obj) {
                                        String planksString = obj.toString().replace("stripped_", "").replaceAll("_[^_]+$", "_planks}");
                                        EarlyGame.LOGGER.info("Convert to: " + planksString);
                                        for (Block planks : BlockTags.PLANKS.values()) {
                                            if (planks.toString().equals(planksString)) {
                                                itemEntity = new ItemEntity(
                                                    player.world,
                                                    block.getPos().x,
                                                    block.getPos().y - 0.5,
                                                    block.getPos().z,
                                                    new ItemStack(planks, r2));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (isPlank) {
                                r2 = isSaw ? 2 : RANDOM.nextInt(2) + 1;
                                itemEntity = new ItemEntity(
                                    player.world,
                                    block.getPos().x,
                                    block.getPos().y - 0.5,
                                    block.getPos().z,
                                    new ItemStack(Items.STICK, r2));
                            }
                            player.world.spawnEntity(itemEntity);
                        }
                        else
                            world.playSound(null, pos, SoundEvents.BLOCK_WOOD_HIT,
                                SoundCategory.PLAYERS, 1.0F, 1.0F);
    
                        if (stack.getItem().isDamageable()) {
                                
                            ItemStack savedStack = stack.copy();
                            boolean shouldAttemptDmg = true;
                            Random random = new Random();
                            int unbreakingLvl = EnchantmentHelper.getLevel(Enchantments.UNBREAKING, savedStack);
            
                            if (unbreakingLvl > 0) shouldAttemptDmg = (1 + random.nextInt(5)) <= unbreakingLvl;
            
                            if (savedStack.getDamage() < savedStack.getMaxDamage()) {
            
                                if (shouldAttemptDmg) savedStack.setDamage(savedStack.getDamage() + 1);
            
                                player.setStackInHand(hand, savedStack);
            
                            }
            
                            else player.setStackInHand(hand, ItemStack.EMPTY);
            
                        }
                        
                    }
                    return ActionResult.SUCCESS;
                }

            return ActionResult.PASS;
        });
    }
}
