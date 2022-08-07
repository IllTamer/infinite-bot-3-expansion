package com.illtamer.infinite.bot.expansion.view;

import com.illtamer.infinite.bot.api.util.Assert;
import com.illtamer.infinite.bot.expansion.view.listener.GameMessageViewListener;
import com.illtamer.infinite.bot.expansion.view.listener.GroupMessageViewListener;
import com.illtamer.infinite.bot.minecraft.api.EventExecutor;
import com.illtamer.infinite.bot.minecraft.expansion.ExpansionConfig;
import com.illtamer.infinite.bot.minecraft.expansion.manager.InfiniteExpansion;
import com.loohp.interactivechat.registry.Registry;
import org.bukkit.Bukkit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ViewManager extends InfiniteExpansion {
    private static ViewManager instance;
    private ExpansionConfig configFile;

    @Override
    public void onEnable() {
        instance = this;
        Hook.init();
        configFile = new ExpansionConfig("config.yml",  instance);
        Assert.notNull(Bukkit.getPluginManager().getPlugin("InteractiveChatDiscordSrvAddon"), "前置插件 InteractiveChatDiscordSrvAddon 未加载");
        EventExecutor.registerEvents(new GroupMessageViewListener(), instance);
        EventExecutor.registerBukkitEvent(new GameMessageViewListener(), instance);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getExpansionName() {
        return "ViewManager";
    }

    public ExpansionConfig getConfigFile() {
        return configFile;
    }

    public static ViewManager getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        final Matcher matcher = Pattern.compile("(?:<(cmd|chat)=([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})(:(.*?):)?>)").matcher("<chat=57876712-e6a6-4cb2-ad64-19137f209beb:[i]:>");
        if (matcher.matches())
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
    }

}