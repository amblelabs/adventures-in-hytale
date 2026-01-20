package dev.amblelabs.aih.components.block;

import com.hypixel.hytale.codec.builder.BuilderCodec;
import com.hypixel.hytale.component.Component;
import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import dev.amblelabs.aih.core.ComponentTypeRegistry;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class TardisBlock implements Component<ChunkStore> {

    public static final BuilderCodec CODEC;

    static {
        CODEC = BuilderCodec.builder(TardisBlock.class, TardisBlock::new).build();
    }

    public TardisBlock() {}

    public void runBlockAction(int x, int y, int z, World world) {
        world.execute(() -> {
            System.out.println("TardisBlock action executed!");
        });
    }

    public static ComponentType getComponentType() {
        return ComponentTypeRegistry.TARDIS_COMPONENT_TYPE;
    }

    @NullableDecl
    @Override
    public Component<ChunkStore> clone() {
        return new TardisBlock();
    }
}
