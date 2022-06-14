package net.mrscauthd.beyond_earth.guis.screens.rocket;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidStack;
import net.mrscauthd.beyond_earth.BeyondEarth;
import net.mrscauthd.beyond_earth.entities.IRocketEntity;
import net.mrscauthd.beyond_earth.guis.helper.ScreenHelper;
import net.mrscauthd.beyond_earth.registries.ItemsRegistry;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class RocketScreen extends AbstractContainerScreen<RocketMenu.GuiContainer> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(BeyondEarth.MODID, "textures/screens/rocket.png");

	public RocketScreen(RocketMenu.GuiContainer container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.imageWidth = 176;
		this.imageHeight = 167;
		this.inventoryLabelY = this.imageHeight - 93;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

		if (ScreenHelper.isInArea(mouseX, mouseY, this.leftPos + 65, this.topPos + 20, 49,49)) {
			List<Component> toolTip = new ArrayList<>();
			toolTip.add(Component.translatable("general." + BeyondEarth.MODID + ".fuel").append(": ").withStyle(ChatFormatting.BLUE).append("\u00A77" + this.getFuel() / 30 + "%"));

			this.renderComponentTooltip(ms, toolTip, mouseX, mouseY);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float p_98414_, int p_98415_, int p_98416_) {

		/** DEFAULT RENDER SETTINGS */
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

		/** BACKGROUND */
		ScreenHelper.drawTexture(ms, this.leftPos, this.topPos, this.imageWidth, this.imageHeight, TEXTURE);

		/** FUEL RENDERER */
		FluidStack fluidStack = new FluidStack(ItemsRegistry.FUEL_BUCKET.get().getFluid(), this.getFuel());
		ScreenHelper.renderFluid.drawFluid(ms, fluidStack, this.leftPos + 67, this.topPos + 22, 46, 46, 37, 37);
	}

	@Override
	protected void renderLabels(PoseStack ms, int p_97809_, int p_97810_) {
		this.font.draw(ms, this.title.getString(), (float) (this.imageWidth / 2) - 33, (float) this.titleLabelY, 4210752);

		this.font.draw(ms, this.playerInventoryTitle, (float) this.inventoryLabelX, (float) this.inventoryLabelY, 4210752);
	}

	public int getFuel() {
		return menu.rocket.getEntityData().get(IRocketEntity.FUEL);
	}
}
