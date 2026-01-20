package dev.amblelabs.aih;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.universe.Universe;
import com.hypixel.hytale.server.core.universe.world.WorldConfig;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public class AIHPlugin extends JavaPlugin {

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
        LOGGER.at(Level.INFO).log("Hello from the template!");
    }
}
