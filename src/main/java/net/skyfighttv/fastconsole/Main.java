package net.skyfighttv.fastconsole;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;

    {
        instance = this;

        ((Logger) LogManager.getRootLogger()).addFilter(new LogFilter());
    }

    public static Main getInstance() {
        return instance;
    }
}
