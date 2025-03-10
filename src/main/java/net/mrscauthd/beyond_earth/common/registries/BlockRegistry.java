package net.mrscauthd.beyond_earth.common.registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrscauthd.beyond_earth.BeyondEarth;
import net.mrscauthd.beyond_earth.common.blocks.CoalLanternBlock;
import net.mrscauthd.beyond_earth.common.blocks.CoalTorchBlock;
import net.mrscauthd.beyond_earth.common.blocks.RocketLaunchPad;
import net.mrscauthd.beyond_earth.common.blocks.WallCoalTorchBlock;
import net.mrscauthd.beyond_earth.common.blocks.FlagBlock;
import net.mrscauthd.beyond_earth.common.blocks.GlobeBlock;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondEarth.MODID);

    /** SPECIAL BLOCKS */
    public static final RegistryObject<Block> ROCKET_LAUNCH_PAD = BLOCKS.register("rocket_launch_pad", () -> new RocketLaunchPad(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COAL_TORCH_BLOCK = BLOCKS.register("coal_torch",() -> new CoalTorchBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().instabreak().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WALL_COAL_TORCH_BLOCK = BLOCKS.register("wall_coal_torch",() -> new WallCoalTorchBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().instabreak().sound(SoundType.WOOD).lootFrom(COAL_TORCH_BLOCK::get)));
    public static final RegistryObject<Block> COAL_LANTERN_BLOCK = BLOCKS.register("coal_lantern",() -> new CoalLanternBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3.5F).sound(SoundType.LANTERN).noOcclusion().requiresCorrectToolForDrops()));

    /** MACHINES */
    //TODO FORGOT NOT TO REWORK IT
    /*
    public static final RegistryObject<Block> FUEL_REFINERY_BLOCK = BLOCKS.register("fuel_refinery",() -> new FuelRefineryBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPRESSOR_BLOCK = BLOCKS.register("compressor",() -> new CompressorBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COAL_GENERATOR_BLOCK = BLOCKS.register("coal_generator",() -> new CoalGeneratorBlock(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OXYGEN_LOADER_BLOCK = BLOCKS.register("oxygen_loader",() -> new OxygenLoaderBlock(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SOLAR_PANEL_BLOCK = BLOCKS.register("solar_panel",() -> new SolarPanelBlock(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NASA_WORKBENCH_BLOCK = BLOCKS.register("nasa_workbench",() -> new NASAWorkbenchBlock(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> OXYGEN_BUBBLE_DISTRIBUTOR_BLOCK = BLOCKS.register("oxygen_bubble_distributor",() -> new OxygenBubbleDistributorBlock(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WATER_PUMP_BLOCK = BLOCKS.register("water_pump",() -> new WaterPump(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).noOcclusion().strength(5f, 1f).requiresCorrectToolForDrops()));
*/

    /** GLOBE BLOCKS */
    public static final RegistryObject<Block> EARTH_GLOBE_BLOCK = BLOCKS.register("earth_globe",() -> new GlobeBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5F).sound(SoundType.STONE).noOcclusion().requiresCorrectToolForDrops(), new ResourceLocation(BeyondEarth.MODID, "textures/blocks/globes/earth_globe.png")));
    public static final RegistryObject<Block> MOON_GLOBE_BLOCK = BLOCKS.register("moon_globe",() -> new GlobeBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5F).sound(SoundType.STONE).noOcclusion().requiresCorrectToolForDrops(), new ResourceLocation(BeyondEarth.MODID, "textures/blocks/globes/moon_globe.png")));
    public static final RegistryObject<Block> MARS_GLOBE_BLOCK = BLOCKS.register("mars_globe",() -> new GlobeBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5F).sound(SoundType.STONE).noOcclusion().requiresCorrectToolForDrops(), new ResourceLocation(BeyondEarth.MODID, "textures/blocks/globes/mars_globe.png")));
    public static final RegistryObject<Block> MERCURY_GLOBE_BLOCK = BLOCKS.register("mercury_globe",() -> new GlobeBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5F).sound(SoundType.STONE).noOcclusion().requiresCorrectToolForDrops(), new ResourceLocation(BeyondEarth.MODID, "textures/blocks/globes/mercury_globe.png")));
    public static final RegistryObject<Block> VENUS_GLOBE_BLOCK = BLOCKS.register("venus_globe",() -> new GlobeBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5F).sound(SoundType.STONE).noOcclusion().requiresCorrectToolForDrops(), new ResourceLocation(BeyondEarth.MODID, "textures/blocks/globes/venus_globe.png")));
    public static final RegistryObject<Block> GLACIO_GLOBE_BLOCK = BLOCKS.register("glacio_globe",() -> new GlobeBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5F).sound(SoundType.STONE).noOcclusion().requiresCorrectToolForDrops(), new ResourceLocation(BeyondEarth.MODID, "textures/blocks/globes/glacio_globe.png")));

    /** FLAG BLOCKS */
    public static final RegistryObject<Block> FLAG_BLOCK = BLOCKS.register("flag",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_BLUE_BLOCK = BLOCKS.register("flag_blue",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_BROWN_BLOCK = BLOCKS.register("flag_brown",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_CYAN_BLOCK = BLOCKS.register("flag_cyan",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_GRAY_BLOCK = BLOCKS.register("flag_gray",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_GREEN_BLOCK = BLOCKS.register("flag_green",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_LIGHT_BLUE_BLOCK = BLOCKS.register("flag_light_blue",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_LIME_BLOCK = BLOCKS.register("flag_lime",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_MAGENTA_BLOCk = BLOCKS.register("flag_magenta",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_ORANGE_BLOCK = BLOCKS.register("flag_orange",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_PINK_BLOCK = BLOCKS.register("flag_pink",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_PURPLE_BLOCK = BLOCKS.register("flag_purple",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_RED_BLOCK = BLOCKS.register("flag_red",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistryObject<Block> FLAG_YELLOW_BLOCK = BLOCKS.register("flag_yellow",() -> new FlagBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 1).isRedstoneConductor((bs, br, bp) -> false)));

    /** ORES */
    public static final RegistryObject<Block> MOON_CHEESE_ORE = BLOCKS.register("moon_cheese_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOON_DESH_ORE = BLOCKS.register("moon_desh_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOON_IRON_ORE = BLOCKS.register("moon_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOON_ICE_SHARD_ORE = BLOCKS.register("moon_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> MARS_IRON_ORE = BLOCKS.register("mars_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MARS_DIAMOND_ORE = BLOCKS.register("mars_diamond_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> MARS_OSTRUM_ORE = BLOCKS.register("mars_ostrum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MARS_ICE_SHARD_ORE = BLOCKS.register("mars_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> MERCURY_IRON_ORE = BLOCKS.register("mercury_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_COAL_ORE = BLOCKS.register("venus_coal_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> VENUS_GOLD_ORE = BLOCKS.register("venus_gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_DIAMOND_ORE = BLOCKS.register("venus_diamond_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> VENUS_CALORITE_ORE = BLOCKS.register("venus_calorite_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLACIO_ICE_SHARD_ORE = BLOCKS.register("glacio_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> GLACIO_COAL_ORE = BLOCKS.register("glacio_coal_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> GLACIO_COPPER_ORE = BLOCKS.register("glacio_copper_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLACIO_IRON_ORE = BLOCKS.register("glacio_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLACIO_LAPIS_ORE = BLOCKS.register("glacio_lapis_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    /** FALLING BLOCKS */
    public static final RegistryObject<Block> MOON_SAND = BLOCKS.register("moon_sand", () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_GRAY).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> MARS_SAND = BLOCKS.register("mars_sand", () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> VENUS_SAND = BLOCKS.register("venus_sand", () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.SAND).strength(0.5f, 0.5f)));

    /** NORMAL BLOCKS */
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DESH_BLOCK = BLOCKS.register("desh_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OSTRUM_BLOCK = BLOCKS.register("ostrum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALORITE_BLOCK = BLOCKS.register("calorite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_DESH_BLOCK = BLOCKS.register("raw_desh_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_OSTRUM_BLOCK = BLOCKS.register("raw_ostrum_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_CALORITE_BLOCK = BLOCKS.register("raw_calorite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IRON_PLATING_BLOCK = BLOCKS.register("iron_plating_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUSTED_IRON_PILLAR_BLOCK = BLOCKS.register("rusted_iron_pillar_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUSTED_IRON_PLATING_BLOCK = BLOCKS.register("rusted_iron_plating_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_IRON_PLATING_BLOCK = BLOCKS.register("blue_iron_plating_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).lightLevel(state -> 15).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IRON_MARK_BLOCK = BLOCKS.register("iron_mark_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 2.5f).requiresCorrectToolForDrops()));

    // NATURAL BLOCKS (without category)
    public static final RegistryObject<Block> SKY_STONE = BLOCKS.register("sky_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> INFERNAL_SPIRE_BLOCK = BLOCKS.register("infernal_spire_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));

    // MOON BLOCKS
    public static final RegistryObject<Block> MOON_STONE = BLOCKS.register("moon_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_MOON_STONE_BRICKS = BLOCKS.register("cracked_moon_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOON_STONE_BRICKS = BLOCKS.register("moon_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOON_STONE_BRICK_SLAB = BLOCKS.register("moon_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOON_STONE_BRICK_STAIRS = BLOCKS.register("moon_stone_brick_stairs", () -> new StairBlock(() -> MOON_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MOON_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    // MARS BLOCKS
    public static final RegistryObject<Block> MARS_STONE = BLOCKS.register("mars_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_MARS_STONE_BRICKS = BLOCKS.register("cracked_mars_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MARS_STONE_BRICKS = BLOCKS.register("mars_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MARS_STONE_BRICK_SLAB = BLOCKS.register("mars_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MARS_STONE_BRICK_STAIRS = BLOCKS.register("mars_stone_brick_stairs", () -> new StairBlock(() -> MARS_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MARS_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    // MERCURY BLOCKS
    public static final RegistryObject<Block> MERCURY_STONE = BLOCKS.register("mercury_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_MERCURY_STONE_BRICKS = BLOCKS.register("cracked_mercury_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MERCURY_STONE_BRICKS = BLOCKS.register("mercury_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MERCURY_STONE_BRICK_SLAB = BLOCKS.register("mercury_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MERCURY_STONE_BRICK_STAIRS = BLOCKS.register("mercury_stone_brick_stairs", () -> new StairBlock(() -> MERCURY_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MERCURY_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    // VENUS BLOCKS
    public static final RegistryObject<Block> VENUS_STONE = BLOCKS.register("venus_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_VENUS_STONE_BRICKS = BLOCKS.register("cracked_venus_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_STONE_BRICKS = BLOCKS.register("venus_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_STONE_BRICK_SLAB = BLOCKS.register("venus_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_STONE_BRICK_STAIRS = BLOCKS.register("venus_stone_brick_stairs", () -> new StairBlock(() -> VENUS_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(VENUS_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    // VENUS SANDSTONE BLOCKS
    public static final RegistryObject<Block> VENUS_SANDSTONE = BLOCKS.register("venus_sandstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_VENUS_SANDSTONE_BRICKS = BLOCKS.register("cracked_venus_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_SANDSTONE_BRICKS = BLOCKS.register("venus_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_SANDSTONE_BRICK_SLAB = BLOCKS.register("venus_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VENUS_SANDSTONE_BRICK_STAIRS = BLOCKS.register("venus_sandstone_brick_stairs", () -> new StairBlock(() -> VENUS_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(VENUS_SANDSTONE_BRICKS.get()).requiresCorrectToolForDrops()));

    // GLACIO BLOCKS
    public static final RegistryObject<Block> GLACIO_STONE = BLOCKS.register("glacio_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERMAFROST = BLOCKS.register("permafrost", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_GLACIO_STONE_BRICKS = BLOCKS.register("cracked_glacio_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLACIO_STONE_BRICKS = BLOCKS.register("glacio_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLACIO_STONE_BRICK_SLAB = BLOCKS.register("glacio_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLACIO_STONE_BRICK_STAIRS = BLOCKS.register("glacio_stone_brick_stairs", () -> new StairBlock(() -> VENUS_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(VENUS_STONE_BRICKS.get()).requiresCorrectToolForDrops()));

    /** FLUID BLOCKS */
    //FUEL
    public static final RegistryObject<LiquidBlock> FUEL_BLOCK = BLOCKS.register("fuel",() -> new LiquidBlock(FluidRegistry.FUEL_STILL, Block.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));

    //OIL
    public static final RegistryObject<LiquidBlock> OIL_BLOCK = BLOCKS.register("oil",() -> new LiquidBlock(FluidRegistry.OIL_STILL, Block.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
}
