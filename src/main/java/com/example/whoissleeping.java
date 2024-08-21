package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.world.GameRules;

public class whoissleeping implements ModInitializer {

    private boolean wasNight = false;

    @Override
    public void onInitialize() {
        ServerTickEvents.END_WORLD_TICK.register(this::onWorldTick);
    }

    private void onWorldTick(ServerWorld world) {
        if (world.getDimension().hasSkyLight()) {  // Only run this for worlds with day/night cycle
            boolean isNight = world.getTimeOfDay() >= 13000 && world.getTimeOfDay() < 23000;

            if (wasNight && !isNight) {  // Transition from night to day
                for (ServerPlayerEntity player : world.getPlayers()) {
                    if (player.getServer().getGameRules().getBoolean(GameRules.DO_DAYLIGHT_CYCLE)) {
                        Text message = Text.literal("Player " + player.getName().getString() + " has made it day by sleeping.");
                        player.getServer().getPlayerManager().broadcast(message, false);
                        break;  // Broadcast message once when time turns to day
                    }
                }
            }

            wasNight = isNight;
        }
    }
}
