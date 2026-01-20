package dev.amblelabs.aih.core;

import com.hypixel.hytale.component.ComponentRegistryProxy;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import dev.amblelabs.aih.system.TardisSystem;

// Probably unnecessary but it keeps it clean
public class SystemRegistry {
    public static void registerSystems(ComponentRegistryProxy<ChunkStore> registry) {
        registry.registerSystem(new TardisSystem());
    }
}
