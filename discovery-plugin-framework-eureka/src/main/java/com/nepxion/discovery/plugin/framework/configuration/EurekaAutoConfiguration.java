package com.nepxion.discovery.plugin.framework.configuration;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nepxion.discovery.plugin.framework.adapter.EurekaAdapter;
import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;
import com.nepxion.discovery.plugin.framework.constant.EurekaConstant;

@Configuration
@RibbonClients(defaultConfiguration = { PluginLoadBalanceConfiguration.class, EurekaLoadBalanceConfiguration.class })
public class EurekaAutoConfiguration {
    static {
        System.out.println("");
        System.out.println("╔═══╗");
        System.out.println("╚╗╔╗║");
        System.out.println(" ║║║╠╦══╦══╦══╦╗╔╦══╦═╦╗ ╔╗");
        System.out.println(" ║║║╠╣══╣╔═╣╔╗║╚╝║║═╣╔╣║ ║║");
        System.out.println("╔╝╚╝║╠══║╚═╣╚╝╠╗╔╣║═╣║║╚═╝║");
        System.out.println("╚═══╩╩══╩══╩══╝╚╝╚══╩╝╚═╗╔╝");
        System.out.println("                      ╔═╝║");
        System.out.println("                      ╚══╝");
        System.out.println("Nepxion Discovery - " + EurekaConstant.DISCOVERY_PLUGIN + "  v4.1.2");
        System.out.println("");
    }

    @Bean
    public PluginAdapter pluginAdapter() {
        return new EurekaAdapter();
    }
}