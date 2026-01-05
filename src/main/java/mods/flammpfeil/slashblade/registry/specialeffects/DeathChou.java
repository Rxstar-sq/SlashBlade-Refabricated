package mods.flammpfeil.slashblade.registry.specialeffects;

import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;

public class DeathChou extends SpecialEffect {

    public DeathChou() {
        super(30, true, true);
    }

    public static void onSlashBladeHit(SlashBladeEvent.HitEvent event) {
        ISlashBladeState state = event.getSlashBladeState();

            // 调试：打印所有 SE
        System.out.println("刀上的 SE: " + state);


        if (state.hasSpecialEffect(SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SpecialEffectsRegistry.DEATH_CHOU))) {
            System.out.println("检测到死蝶 SE!");
            if (!(event.getUser() instanceof Player player)) {
                return;
            }

            int level = player.experienceLevel;
              System.out.println("玩家等级: " + level);

            if (SpecialEffect.isEffective(SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SpecialEffectsRegistry.DEATH_CHOU), level)) {
                System.out.println("等级足够，施加效果");
                // 给予目标凋零II效果（放大器为1表示II级）
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 1));
                // 给予目标虚弱II效果（放大器为1表示II级）
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 1));
                } else {
                            System.out.println("等级不足: " + level);
                        }
                    } else {
                        System.out.println("未检测到死蝶 SE");
                    }
}
}