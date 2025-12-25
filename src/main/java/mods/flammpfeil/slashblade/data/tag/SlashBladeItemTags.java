package mods.flammpfeil.slashblade.data.tag;

import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.init.SBItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class SlashBladeItemTags extends FabricTagProvider.ItemTagProvider {
    public static final TagKey<Item> PROUD_SOULS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("slashblade", "proudsouls"));
    public static final TagKey<Item> SLASH_BLADES = TagKey.create(Registries.ITEM, SlashBlade.prefix("slash_blades"));
    public static final TagKey<Item> BAMBOO = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "bamboo"));

    public static final TagKey<Item> CAN_COPY_SA = TagKey.create(Registries.ITEM, SlashBlade.prefix("can_copy_sa"));
    public static final TagKey<Item> CAN_COPY_SE = TagKey.create(Registries.ITEM, SlashBlade.prefix("can_copy_se"));
    public static final TagKey<Item> CAN_CHANGE_SA = TagKey.create(Registries.ITEM, SlashBlade.prefix("can_change_sa"));
    public static final TagKey<Item> CAN_CHANGE_SE = TagKey.create(Registries.ITEM, SlashBlade.prefix("can_change_se"));

    public SlashBladeItemTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.getOrCreateTagBuilder(ItemTags.SWORDS).add(
                SBItems.SLASHBLADE,
                SBItems.SLASHBLADE_BAMBOO,
                SBItems.SLASHBLADE_SILVERBAMBOO,
                SBItems.SLASHBLADE_WHITE,
                SBItems.SLASHBLADE_WOOD,
                // Add all named blades to SWORDS tag for compatibility with mods like Tiered
                SBItems.SLASHBLADE_YAMATO,
                SBItems.SLASHBLADE_YAMATO_BROKEN,
                SBItems.SLASHBLADE_YUZUKITUKUMO,
                SBItems.SLASHBLADE_MURAMASA,
                SBItems.SLASHBLADE_RUBY,
                SBItems.SLASHBLADE_SANGE,
                SBItems.SLASHBLADE_FOX_BLACK,
                SBItems.SLASHBLADE_FOX_WHITE,
                SBItems.SLASHBLADE_RODAI_WOODEN,
                SBItems.SLASHBLADE_RODAI_STONE,
                SBItems.SLASHBLADE_RODAI_IRON,
                SBItems.SLASHBLADE_RODAI_GOLDEN,
                SBItems.SLASHBLADE_RODAI_DIAMOND,
                SBItems.SLASHBLADE_RODAI_NETHERITE,
                SBItems.SLASHBLADE_TAGAYASAN,
                SBItems.SLASHBLADE_AGITO,
                SBItems.SLASHBLADE_AGITO_RUST,
                SBItems.SLASHBLADE_OROTIAGITO,
                SBItems.SLASHBLADE_OROTIAGITO_SEALED,
                SBItems.SLASHBLADE_OROTIAGITO_RUST,
                SBItems.SLASHBLADE_YASHA,
                SBItems.SLASHBLADE_YASHA_TRUE,
                SBItems.SLASHBLADE_SABIGATANA,
                SBItems.SLASHBLADE_SABIGATANA_BROKEN,
                SBItems.SLASHBLADE_DOUTANUKI,
                SBItems.SLASHBLADE_KOSEKI);        
                
        // Add all named blades with unique IDs to SLASH_BLADES tag
        this.getOrCreateTagBuilder(SLASH_BLADES).add(
                SBItems.SLASHBLADE,
                SBItems.SLASHBLADE_YAMATO,
                SBItems.SLASHBLADE_YAMATO_BROKEN,
                SBItems.SLASHBLADE_YUZUKITUKUMO,
                SBItems.SLASHBLADE_MURAMASA,
                SBItems.SLASHBLADE_RUBY,
                SBItems.SLASHBLADE_SANGE,
                SBItems.SLASHBLADE_FOX_BLACK,
                SBItems.SLASHBLADE_FOX_WHITE,
                SBItems.SLASHBLADE_RODAI_WOODEN,
                SBItems.SLASHBLADE_RODAI_STONE,
                SBItems.SLASHBLADE_RODAI_IRON,
                SBItems.SLASHBLADE_RODAI_GOLDEN,
                SBItems.SLASHBLADE_RODAI_DIAMOND,
                SBItems.SLASHBLADE_RODAI_NETHERITE,
                SBItems.SLASHBLADE_TAGAYASAN,
                SBItems.SLASHBLADE_AGITO,
                SBItems.SLASHBLADE_AGITO_RUST,
                SBItems.SLASHBLADE_OROTIAGITO,
                SBItems.SLASHBLADE_OROTIAGITO_SEALED,
                SBItems.SLASHBLADE_OROTIAGITO_RUST,
                SBItems.SLASHBLADE_YASHA,
                SBItems.SLASHBLADE_YASHA_TRUE,
                SBItems.SLASHBLADE_SABIGATANA,
                SBItems.SLASHBLADE_SABIGATANA_BROKEN,
                SBItems.SLASHBLADE_DOUTANUKI,
                SBItems.SLASHBLADE_KOSEKI);
    }
}
