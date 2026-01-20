package dev.amblelabs.aih;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.universe.Universe;
import com.hypixel.hytale.server.core.universe.world.WorldConfig;
import dev.amblelabs.aih.core.ComponentTypeRegistry;
import dev.amblelabs.aih.core.SystemRegistry;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public class AIHPlugin extends JavaPlugin {

    protected static AIHPlugin instance;

    // Might be unnecessary, but I'm not familiar with hytale modding yet
    public static final String MODID = "aih";

    // Might be unnecessary too
    public static String of(String path) {
        return MODID + ":" + path;
    }

    public static AIHPlugin get() {
        return instance;
    }

    public static HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public AIHPlugin(@Nonnull JavaPluginInit init) {
        super(init);
        Universe universe = Universe.get();
        if (universe == null) return;
        WorldConfig config = new WorldConfig();
        config.setWorldGenProvider(null);
        config.setForcedWeather("clear");
        universe.makeWorld("tardis", universe.getPath().resolve("worlds"), config);
    }


    @Override
    protected void setup() {
        instance = this;
        LOGGER.at(Level.INFO).log("AIH has been initialised.");
        ComponentTypeRegistry.registerComponents(this.getChunkStoreRegistry()); // For block components
        SystemRegistry.registerSystems(this.getChunkStoreRegistry()); // For the TARDIS ECS

    }
}
