package me.username.testplugin;

import net.md_5.bungee.api.plugin.Plugin;

public class TestPlugin extends Plugin {
    @Override
    public void  onEnable() {
        // You should not put an enable message in your plugin.
        // BungeeCord already does so.
        getLogger().info("Finally loaded, Whew!");

    }
}
