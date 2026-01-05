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
        if (state.hasSpecialEffect(SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SpecialEffectsRegistry.DEATH_CHOU))) {
            if (!(event.getUser() instanceof Player player)) {
                return;
            }

            int level = player.experienceLevel;

            if (SpecialEffect.isEffective(SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SpecialEffectsRegistry.DEATH_CHOU), level)) {
                // 给予目标凋零II效果（放大器为1表示II级）
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 1));
                // 给予目标虚弱II效果（放大器为1表示II级）
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 1));
            }
        }
    }
}