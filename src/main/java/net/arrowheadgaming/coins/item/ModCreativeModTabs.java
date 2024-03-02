package net.arrowheadgaming.coins.item;

import net.arrowheadgaming.coins.Coins;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Coins.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COINS_TAB = CREATIVE_MODE_TAB.register("coins_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_COIN.get()))
                    .title(Component.translatable("creativetab.coins_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COPPER_COIN.get());
                        pOutput.accept(ModItems.GOLD_COIN.get());
                        pOutput.accept(ModItems.SILVER_COIN.get());
                        pOutput.accept(ModItems.DIAMOND_COIN.get());
                        pOutput.accept(ModItems.EMERALD_COIN.get());
                        pOutput.accept(ModItems.PLATINUM_COIN.get());
                        pOutput.accept(ModItems.COIN_PATTERN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
