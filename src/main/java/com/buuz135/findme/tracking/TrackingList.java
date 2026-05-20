package com.buuz135.findme.tracking;

import com.buuz135.findme.FindMeMod;
import net.minecraft.world.item.ItemStack;

public class TrackingList {
    private static ItemStack stackB = ItemStack.EMPTY;
    private static ItemStack toTrack = ItemStack.EMPTY;
    private static int ticksRemaining = 0;

    public static boolean beingTracked(ItemStack stackA) {
        if (ticksRemaining <= 0) return false;
        return ItemStack.isSameItemSameComponents(stackA, stackB);
    }

    public static void clear() {
        stackB = ItemStack.EMPTY;
        toTrack = ItemStack.EMPTY;
        ticksRemaining = 0;
    }

    public static void trackItem(ItemStack stack) {
        toTrack = stack.copy();
    }

    public static void beginTracking() {
        stackB = toTrack;
        ticksRemaining = FindMeMod.CONFIG.CLIENT.CONTAINER_TRACK_TIME;
    }

    /**
     * 每 tick 调用，倒计时到期后自动清除追踪状态。
     */
    public static void tick() {
        if (ticksRemaining > 0) {
            ticksRemaining--;
            if (ticksRemaining <= 0) {
                clear();
            }
        }
    }
}
