package dev.amblelabs.aih.core;

import com.hypixel.hytale.component.ComponentRegistryProxy;
import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import dev.amblelabs.aih.components.block.TardisBlock;

public class ComponentTypeRegistry {

    public static ComponentType TARDIS_COMPONENT_TYPE;

    public static void registerComponents(ComponentRegistryProxy<ChunkStore> registry) {
        TARDIS_COMPONENT_TYPE = registry.registerComponent(TardisBlock.class, "TARDISBlock", TardisBlock.CODEC);
    }
}
