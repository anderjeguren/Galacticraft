package micdoodle8.mods.galacticraft.moon.client;

import micdoodle8.mods.galacticraft.API.IPlanetSlotRenderer;
import net.minecraft.src.Tessellator;
import cpw.mods.fml.common.FMLLog;

public class GCMoonSlotRenderer implements IPlanetSlotRenderer
{
	@Override
	public String getPlanetSprite() 
	{
		return "/terrain/moon.png";
	}

	@Override
	public String getPlanetName() 
	{
		return "Moon";
	}

	@Override
	public void renderSlot(int index, int x, int y, int slotHeight, Tessellator tessellator) 
	{
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(x - 10 - slotHeight * 0.9, 	y - 1 + slotHeight * 0.9, 		-90.0D, 0.35D, 0.65D);
		tessellator.addVertexWithUV(x - 10, 					y - 1 + slotHeight * 0.9, 		-90.0D, 0.65D, 0.65D);
		tessellator.addVertexWithUV(x - 10, 					y - 1, 							-90.0D, 0.65D, 0.35D);
		tessellator.addVertexWithUV(x - 10 - slotHeight * 0.9, 	y - 1, 							-90.0D, 0.35D, 0.35D);
	    tessellator.draw();
	}
}
