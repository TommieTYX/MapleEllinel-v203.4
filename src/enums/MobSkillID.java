package enums;

import java.util.Arrays;

/**
 * Created on 3/18/2018.
 */
public enum MobSkillID {
    UNK(-1),
    POWERUP(100),
    MAGICUP(101),
    PGUARDUP(102),
    MGUARDUP(103),
    HASTE(104),
    MOB_CONSUME(105),
    POWERUP_M(110),
    MAGICUP_M(111),
    PGUARDUP_M(112),
    MGUARDUP_M(113),
    HEAL_M(114),
    HASTE_M(115),
    SEAL(120),
    DARKNESS(121),
    WEAKNESS(122),
    STUN(123),
    CURSE(124),
    POISON(125),
    SLOW(126),
    DISPEL(127),
    ATTRACT(128),
    BAN_MAP(129),
    AREA_FIRE(130),
    AREA_POISON(131),
    REVERSE_INPUT(132),
    UNDEAD(133),
    STOP_PORTION(134),
    STOP_MOTION(135),
    FEAR(136),
    FROZEN(137),
    DISPEL_ITEM_OPTION(138),
    PHYSICAL_IMMUNE(140),
    MAGIC_IMMUNE(141),
    HARDSKIN(142),
    P_COUNTER(143),
    M_COUNTER(144),
    PM_COUNTER(145),
    INVINCIBLE(146),
    PAD(150),
    MAD(151),
    PDR(152),
    MDR(153),
    ACC(154),
    EVA(155),
    SPEED(156),
    SEAL_SKILL(157),
    BALROG_COUNTER(158),
    TELEPORT(170),
    USER_BOMB(171),
    USER_MORPH(172),
    DARK_TORNADO(173),
    LAPIDIFICATION(174),
    DEATHMARK(175),
    DAMAGE(176),
    VENOMSNAKE(177),
    SLOWATTACK(178),
    PAINMARK(179),
    VAMPDEATH(180),
    MAGNET(181),
    GIVE_ME_HEAL(182),
    FIRE_BOMB(183),
    RETURN_TELEPORT(184),
    AREA_FORCE(186),
    NEAR_BUFF(187),
    DAZZLE(188),
    CAPDEBUFF_RED(189),
    CAPDEBUFF_BLUE(190),
    AREA_TIMEZONE(191),
    SUMMON(200),
    SUMMON2(201),
    PASSIVE_FIREWALK(202),
    BREAKDOWN_TIMEZONE(203),
    ALL_KILL(204),
    FIRE_BOMB_DISPEL(205),
    AREA_TOSP(206),
    HEKATON(207),
    STUNMADE_BODY(208),
    RESET_MOBSTAT(209),
    AREA_ABNORMAL(211),
    AREA_MOBBUFF(212),
    AREA_WARNING(213),
    CASTINGBAR(214),
    OBSTACLE_ATTACK(215),
    FIX_DAMR_BUFF(216),
    BOUNCE_ATTACK(217),
    DEBUFF_HALF(219),
    KNOCKBACK(220),
    AREA_INSTALL_BUFF(221),
    AREA_INSTALLED_FIRE(222),
    LASER_ATTACK(223),
    LT_RB_DAMAGE(224),
    SUMMON_SUBBODY(225),
    TOOS(226),
    AREA_FORCE_FROM_USER(227),
    LASER_CONTROL(228),
    DEC_JUMP(229),
    FIRE_AT_RANDOM_ATTACK(230),
    BATTLEFIELD_DEAD(231),
    TOUCH_ME(232),
    POWER_IMMUNE(233),
    CONTAGION(234),
    FIELD_COMMAND(235),
    HANGOVER(236),
    STIGMA(237),
    NO(238),
    ;

    private int val;

    MobSkillID(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static MobSkillID getMobSkillIDByVal(int val) {
        return Arrays.stream(values()).filter(m -> m.getVal() == val).findFirst().orElse(UNK);
    }

    public static void main(String[] args) {
        for(MobSkillID msi : values()) {
            System.out.println(msi.toString() + "(" + msi.getVal() + "),");
        }
    }
}
