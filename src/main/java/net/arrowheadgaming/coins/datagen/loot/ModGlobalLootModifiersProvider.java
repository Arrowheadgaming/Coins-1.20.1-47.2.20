package net.arrowheadgaming.coins.datagen.loot;

import net.arrowheadgaming.coins.Coins;
import net.arrowheadgaming.coins.item.ModItems;
import net.arrowheadgaming.coins.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Coins.MOD_ID);
    }

    @Override
    protected void start() {
        add("copper_coin_from_shipwreck_map", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build() }, ModItems.COPPER_COIN.get()));
        add("copper_coin_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build() }, ModItems.COPPER_COIN.get()));
        add("copper_coin_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() }, ModItems.COPPER_COIN.get()));

        add("gold_coin_from_shipwreck_map", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build() }, ModItems.GOLD_COIN.get()));
        add("gold_coin_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build() }, ModItems.GOLD_COIN.get()));
        add("gold_coin_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() }, ModItems.GOLD_COIN.get()));

        add("silver_coin_from_shipwreck_map", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build() }, ModItems.SILVER_COIN.get()));
        add("silver_coin_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build() }, ModItems.SILVER_COIN.get()));
        add("silver_coin_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() }, ModItems.SILVER_COIN.get()));

        add("diamond_coin_from_shipwreck_map", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build() }, ModItems.DIAMOND_COIN.get()));
        add("diamond_coin_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build() }, ModItems.DIAMOND_COIN.get()));
        add("diamond_coin_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() }, ModItems.DIAMOND_COIN.get()));

        add("emerald_coin_from_shipwreck_map", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build() }, ModItems.EMERALD_COIN.get()));
        add("emerald_coin_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build() }, ModItems.EMERALD_COIN.get()));
        add("emerald_coin_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() }, ModItems.EMERALD_COIN.get()));

        add("platinum_coin_from_shipwreck_map", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build() }, ModItems.PLATINUM_COIN.get()));
        add("platinum_coin_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build() }, ModItems.PLATINUM_COIN.get()));
        add("platinum_coin_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build() }, ModItems.PLATINUM_COIN.get()));

    }
}
