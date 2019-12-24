package com.xiaozhengkeji.vipfly.listener;

import com.xiaozhengkeji.vipfly.Data;
import com.xiaozhengkeji.vipfly.Vipfly;
import com.xiaozhengkeji.vipfly.entity.PlayerFlyTimeEntity;
import com.xiaozhengkeji.vipfly.utils.MsgUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;

public class VipFlyListener implements Listener {
    HashMap<String, Boolean> playerHashMap = new HashMap<>();
    //玩家飞行

    @EventHandler
    public void onPlayerToggleFlightEvent(PlayerToggleFlightEvent e) {
        new BukkitRunnable() {
            @Override
            public void run() {
                Player p = e.getPlayer();
                if (e.isFlying()) {
                    //开启飞行检测
                    if (!(p.isOp())) {
                        if (p.hasPermission("vipfly.120") | p.hasPermission("vipfly.240") | p.hasPermission("vipfly.480") | p.hasPermission("vipfly.960")) {
                            if (playerHashMap.containsKey(p.getName()) && playerHashMap.get(p.getName())) {
                                //进入飞行
                                if (p.hasPermission("vipfly.120")) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            playerHashMap.replace(p.getName(), false);
                                            p.setFlying(false);
                                            MsgUtils.logPlayer(p, Vipfly.玩家飞行时间到期);
                                            Data.playerHashMap.replace(p.getName(), 30);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    Integer i = Data.playerHashMap.get(p.getName());
                                                    if (i == 0) {
                                                        Data.playerHashMap.replace(p.getName(), i);
                                                        cancel();
                                                    }
                                                    i = i - 1;
                                                }
                                            }.runTaskTimerAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 0, 20);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    playerHashMap.replace(p.getName(), true);
                                                }
                                            }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 30 * 20);
                                        }
                                    }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 120 * 20);
                                }
                                if (p.hasPermission("vipfly.240")) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            playerHashMap.replace(p.getName(), false);
                                            p.setFlying(false);
                                            MsgUtils.logPlayer(p, Vipfly.玩家飞行时间到期);
                                            Data.playerHashMap.replace(p.getName(), 30);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    Integer i = Data.playerHashMap.get(p.getName());
                                                    if (i == 0) {
                                                        Data.playerHashMap.replace(p.getName(), i);
                                                        cancel();
                                                    }
                                                    i = i - 1;
                                                }
                                            }.runTaskTimerAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 0, 20);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    playerHashMap.replace(p.getName(), true);
                                                }
                                            }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 30 * 20);
                                        }
                                    }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 240 * 20);
                                }
                                if (p.hasPermission("vipfly.480")) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            playerHashMap.replace(p.getName(), false);
                                            p.setFlying(false);
                                            MsgUtils.logPlayer(p, Vipfly.玩家飞行时间到期);
                                            Data.playerHashMap.replace(p.getName(), 30);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    Integer i = Data.playerHashMap.get(p.getName());
                                                    if (i == 0) {
                                                        Data.playerHashMap.replace(p.getName(), i);
                                                        cancel();
                                                    }
                                                    i = i - 1;
                                                }
                                            }.runTaskTimerAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 0, 20);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    playerHashMap.replace(p.getName(), true);
                                                }
                                            }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 30 * 20);
                                        }
                                    }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 480 * 20);
                                }
                                if (p.hasPermission("vipfly.960")) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            playerHashMap.replace(p.getName(), false);
                                            p.setFlying(false);
                                            MsgUtils.logPlayer(p, Vipfly.玩家飞行时间到期);
                                            Data.playerHashMap.replace(p.getName(), 30);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    Integer i = Data.playerHashMap.get(p.getName());
                                                    if (i == 0) {
                                                        Data.playerHashMap.replace(p.getName(), i);
                                                        cancel();
                                                    }
                                                    i = i - 1;
                                                }
                                            }.runTaskTimerAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 0, 20);
                                            new BukkitRunnable() {
                                                @Override
                                                public void run() {
                                                    playerHashMap.replace(p.getName(), true);
                                                }
                                            }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 30 * 20);
                                        }
                                    }.runTaskLaterAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class), 960 * 20);
                                }
                            } else {
                                MsgUtils.logPlayer(p, Vipfly.玩家CD冷却);
                                p.setFlying(false);
                            }
                        } else {
                            MsgUtils.logPlayer(p, Vipfly.玩家没有VIP飞行权限);
                            p.setFlying(false);
                        }
                    }
                }

            }
        }.runTaskAsynchronously(Vipfly.getProvidingPlugin(Vipfly.class));
    }

    //玩家进服

    @EventHandler
    public void onPlayerJoinServer(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        playerHashMap.put(p.getName(), true);
        Data.playerHashMap.put(p.getName(), 0);
    }

    //退服

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        playerHashMap.remove(p.getName());
        Data.playerHashMap.remove(p.getName());
    }
}
