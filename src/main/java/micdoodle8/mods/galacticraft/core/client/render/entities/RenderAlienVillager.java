package micdoodle8.mods.galacticraft.core.client.render.entities;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.client.model.ModelAlienVillager;
import micdoodle8.mods.galacticraft.core.entities.EntityAlienVillager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderAlienVillager extends RenderLiving<EntityAlienVillager>
{
    private static final ResourceLocation villagerTexture = new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/model/villager.png");

    protected ModelAlienVillager villagerModel;

    public RenderAlienVillager(RenderManager manager)
    {
        super(manager, new ModelAlienVillager(0.0F), 0.5F);
        this.villagerModel = (ModelAlienVillager) this.mainModel;
    }

    @Override
    protected void preRenderCallback(EntityAlienVillager villager, float par2)
    {
        float f1 = 0.9375F;

        if (villager.getGrowingAge() < 0)
        {
            f1 = (float) (f1 * 0.5D);
            this.shadowSize = 0.25F;
        }
        else
        {
            this.shadowSize = 0.5F;
        }

        GL11.glScalef(f1, f1, f1);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityAlienVillager par1Entity)
    {
        return RenderAlienVillager.villagerTexture;
    }

    @Override
    public void doRender(EntityAlienVillager villager, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(villager, par2, par4, par6, par8, par9);
    }
}
