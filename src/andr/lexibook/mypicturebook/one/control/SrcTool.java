package andr.lexibook.mypicturebook.one.control;

import andr.lexibook.mypicturebook.one.R;

/**
 * Created by rain on 8/10/13.
 */
public class SrcTool {


    private static SrcTool instance;
    private int qIndex;

    public static SrcTool getInstance() {
        if (instance == null) {
            instance = new SrcTool();
        }
        return instance;
    }

    public SrcTool setQIndex(int qIndex) {
        this.qIndex = qIndex;
        return this;
    }

    /**
     * no params
     *
     * @return
     */
    public int getFrText() {
        return txt_frs[this.qIndex];
    }

    public int getFg() {
        return fgs[this.qIndex];
    }

    public int getBg() {
        return bgs[this.qIndex];
    }

    public int[] getGreen() {
        return greens[this.qIndex];
    }

    public int[] getGrey() {
        return greys[this.qIndex];
    }

    public int[] getRed() {
        return reds[this.qIndex];
    }

    public int getAnim() {
        return anims[this.qIndex];
    }

    public int[] getLocation() {
        return locations[this.qIndex];
    }


    public int getQSound() {
        return qSounds[this.qIndex];
    }

    public int[] getASound() {
        return aSounds[this.qIndex];
    }

    /**
     * has params qIndex
     *
     * @return
     */
    public int getFrText(int qIndex) {
        return txt_frs[qIndex];
    }

    public int getFg(int qIndex) {
        return fgs[qIndex];
    }

    public int getBg(int qIndex) {
        return bgs[qIndex];
    }

    public int[] getGreen(int qIndex) {
        return greens[qIndex];
    }

    public int[] getGrey(int qIndex) {
        return greys[qIndex];
    }

    public int[] getRed(int qIndex) {
        return reds[qIndex];
    }

    public int getAnim(int qIndex) {
        return anims[qIndex];
    }

    public int[] getLocation(int qIndex) {
        return locations[qIndex];
    }

    public int getQSound(int qIndex) {
        return qSounds[qIndex];
    }

    public int[] getASound(int qIndex) {
        return aSounds[qIndex];
    }

    private int[] qSounds = {
            R.string.mp3_home_003
            , R.string.mp3_home_014
            , R.string.mp3_home_025//31
            , R.string.mp3_home_037

            , R.string.mp3_home_049
            , R.string.mp3_home_060
            , R.string.mp3_home_071
            , R.string.mp3_home_082

            , R.string.mp3_home_094
            , R.string.mp3_home_105
            , R.string.mp3_home_116
            , R.string.mp3_home_127

            , R.string.mp3_home_139
            , R.string.mp3_home_150 //155
            , R.string.mp3_home_162
            , R.string.mp3_home_173
    };

    private int[][] aSounds = {
            {
                    R.string.mp3_home_004
                    , R.string.mp3_home_005
                    , R.string.mp3_home_006
                    , R.string.mp3_home_007
                    , R.string.mp3_home_008
                    , R.string.mp3_home_009
                    , R.string.mp3_home_010
                    , R.string.mp3_home_011
                    , R.string.mp3_home_012
                    , R.string.mp3_home_013
            }, {
            R.string.mp3_home_015
            , R.string.mp3_home_016
            , R.string.mp3_home_017
            , R.string.mp3_home_018
            , R.string.mp3_home_019
            , R.string.mp3_home_020
            , R.string.mp3_home_021
            , R.string.mp3_home_022
            , R.string.mp3_home_023
            , R.string.mp3_home_024
    }, {
            R.string.mp3_home_026
            ,R.string.mp3_home_027
            , R.string.mp3_home_028
            , R.string.mp3_home_029
            , R.string.mp3_home_030//31 for question b
            , R.string.mp3_home_032
            , R.string.mp3_home_033
            , R.string.mp3_home_034
            , R.string.mp3_home_035
            , R.string.mp3_home_036
    }, {
            R.string.mp3_home_038
            , R.string.mp3_home_039
            , R.string.mp3_home_040
            , R.string.mp3_home_041
            , R.string.mp3_home_042
            , R.string.mp3_home_043
            , R.string.mp3_home_044
            , R.string.mp3_home_045
            , R.string.mp3_home_046
            , R.string.mp3_home_047
    }, {
            R.string.mp3_home_049
            , R.string.mp3_home_050
            , R.string.mp3_home_052
            , R.string.mp3_home_053
            , R.string.mp3_home_054
            , R.string.mp3_home_055
            , R.string.mp3_home_056
            , R.string.mp3_home_057
            , R.string.mp3_home_058
    }, {
            R.string.mp3_home_061
            , R.string.mp3_home_062
            , R.string.mp3_home_063
            , R.string.mp3_home_064
            , R.string.mp3_home_065
            , R.string.mp3_home_066
            , R.string.mp3_home_067
            , R.string.mp3_home_068
            , R.string.mp3_home_069
            , R.string.mp3_home_070
    }, {
            R.string.mp3_home_072
            , R.string.mp3_home_073
            , R.string.mp3_home_074
            , R.string.mp3_home_075
            , R.string.mp3_home_076
            , R.string.mp3_home_077
            , R.string.mp3_home_078
            , R.string.mp3_home_079
            , R.string.mp3_home_080
            , R.string.mp3_home_081
    }, {
            R.string.mp3_home_083
            , R.string.mp3_home_084
            , R.string.mp3_home_085
            , R.string.mp3_home_086
            , R.string.mp3_home_087
            , R.string.mp3_home_088
            , R.string.mp3_home_089
            , R.string.mp3_home_090
            , R.string.mp3_home_091
            , R.string.mp3_home_092
    }, {
            R.string.mp3_home_095
            , R.string.mp3_home_096
            , R.string.mp3_home_097
            , R.string.mp3_home_098
            , R.string.mp3_home_099
            , R.string.mp3_home_100
            , R.string.mp3_home_101
            , R.string.mp3_home_102
            , R.string.mp3_home_103
            , R.string.mp3_home_104
    }, {
            R.string.mp3_home_106
            , R.string.mp3_home_107
            , R.string.mp3_home_108
            , R.string.mp3_home_109
            , R.string.mp3_home_110
            , R.string.mp3_home_111
            , R.string.mp3_home_112
            , R.string.mp3_home_113
            , R.string.mp3_home_114
            , R.string.mp3_home_115
    }, {
            R.string.mp3_home_117
            , R.string.mp3_home_118
            , R.string.mp3_home_119
            , R.string.mp3_home_120
            , R.string.mp3_home_121
            , R.string.mp3_home_122
            , R.string.mp3_home_123
            , R.string.mp3_home_124
            , R.string.mp3_home_125
            , R.string.mp3_home_126
    }, {
            R.string.mp3_home_128
            , R.string.mp3_home_129
            , R.string.mp3_home_130
            , R.string.mp3_home_131
            , R.string.mp3_home_132
            , R.string.mp3_home_133
            , R.string.mp3_home_134
            , R.string.mp3_home_135
            , R.string.mp3_home_136
            , R.string.mp3_home_137
    }, {
            R.string.mp3_home_140
            , R.string.mp3_home_141
            , R.string.mp3_home_142
            , R.string.mp3_home_143
            , R.string.mp3_home_144
            , R.string.mp3_home_145
            , R.string.mp3_home_146
            , R.string.mp3_home_147
            , R.string.mp3_home_148
            , R.string.mp3_home_149
    }, {
            R.string.mp3_home_151
            , R.string.mp3_home_152
            , R.string.mp3_home_153
            , R.string.mp3_home_154//155 to question b
            , R.string.mp3_home_156
            , R.string.mp3_home_157
            , R.string.mp3_home_158
            , R.string.mp3_home_159
            , R.string.mp3_home_160
            , R.string.mp3_home_161
    }, {
            R.string.mp3_home_163
            , R.string.mp3_home_164
            , R.string.mp3_home_165
            , R.string.mp3_home_166
            , R.string.mp3_home_167
            , R.string.mp3_home_168
            , R.string.mp3_home_169
            , R.string.mp3_home_170
            , R.string.mp3_home_171
            , R.string.mp3_home_172
    }
    };

    private int[][] locations = {
            {
                    R.array.home_kitchen_q1_cravate
                    , R.array.home_kitchen_q1_lepingle
                    , R.array.home_kitchen_q1_chausse
                    , R.array.home_kitchen_q1_bijou
                    , R.array.home_kitchen_q1_maquillage
                    , R.array.home_kitchen_q1_fouet
                    , R.array.home_kitchen_q1_cocotte
                    , R.array.home_kitchen_q1_lepluche
                    , R.array.home_kitchen_q1_lecumoire
                    , R.array.home_kitchen_q1_passoire
            }, {
            R.array.home_kitchen_q2_leau
            , R.array.home_kitchen_q2_lait
            , R.array.home_kitchen_q2_huile
            , R.array.home_kitchen_q2_vinaigre
            , R.array.home_kitchen_q2_sucre
            , R.array.home_kitchen_q2_farine
            , R.array.home_kitchen_q2_sel
            , R.array.home_kitchen_q2_poivre
            , R.array.home_kitchen_q2_beurre
            , R.array.home_kitchen_q2_moutarde
    }, {
            R.array.home_kitchen_q3_lorange
            , R.array.home_kitchen_q3_pomme
            , R.array.home_kitchen_q3_fraise
            , R.array.home_kitchen_q3_banane
            , R.array.home_kitchen_q3_poire
            , R.array.home_kitchen_q3_chou
            , R.array.home_kitchen_q3_poireau
            , R.array.home_kitchen_q3_pomme_de
            , R.array.home_kitchen_q3_carotte
            , R.array.home_kitchen_q3_concombre
    }, {
            R.array.home_kitchen_q4_plat
            , R.array.home_kitchen_q4_cuillere
            , R.array.home_kitchen_q4_verre
            , R.array.home_kitchen_q4_fourchette
            , R.array.home_kitchen_q4_bol
            , R.array.home_kitchen_q4_serviette
            , R.array.home_kitchen_q4_coutean
            , R.array.home_kitchen_q4_tasse
            , R.array.home_kitchen_q4_lassiette
            , R.array.home_kitchen_q4_marteau
    }, {
            R.array.home_bathroom_q5_pistolet
            , R.array.home_bathroom_q5_aquatique
            , R.array.home_bathroom_q5_canard
            , R.array.home_bathroom_q5_pingouin
            , R.array.home_bathroom_q5_cereales
            , R.array.home_bathroom_q5_laisse
            , R.array.home_bathroom_q5_mixuer
            , R.array.home_bathroom_q5_brique
            , R.array.home_bathroom_q5_bois
            , R.array.home_bathroom_q5_laque
    }, {
            R.array.home_bathroom_q6_anim01
            , R.array.home_bathroom_q6_anim02
            , R.array.home_bathroom_q6_anim03
            , R.array.home_bathroom_q6_anim04
            , R.array.home_bathroom_q6_anim05
            , R.array.home_bathroom_q6_anim06
            , R.array.home_bathroom_q6_anim07
            , R.array.home_bathroom_q6_anim08
            , R.array.home_bathroom_q6_anim09
            , R.array.home_bathroom_q6_anim10
    }, {
            R.array.home_bathroom_q7_anim01
            , R.array.home_bathroom_q7_anim02
            , R.array.home_bathroom_q7_anim03
            , R.array.home_bathroom_q7_anim04
            , R.array.home_bathroom_q7_anim05
            , R.array.home_bathroom_q7_anim06
            , R.array.home_bathroom_q7_anim07
            , R.array.home_bathroom_q7_anim08
            , R.array.home_bathroom_q7_anim09
            , R.array.home_bathroom_q7_anim10
    }, {
            R.array.home_bathroom_q8_anim01
            , R.array.home_bathroom_q8_anim02
            , R.array.home_bathroom_q8_anim03
            , R.array.home_bathroom_q8_anim04
            , R.array.home_bathroom_q8_anim05
            , R.array.home_bathroom_q8_anim06
            , R.array.home_bathroom_q8_anim07
            , R.array.home_bathroom_q8_anim08
            , R.array.home_bathroom_q8_anim09
            , R.array.home_bathroom_q8_anim10
    }, {
            R.array.home_bedroom_q9_anim01
            , R.array.home_bedroom_q9_anim02
            , R.array.home_bedroom_q9_anim03
            , R.array.home_bedroom_q9_anim04
            , R.array.home_bedroom_q9_anim05
            , R.array.home_bedroom_q9_anim06
            , R.array.home_bedroom_q9_anim07
            , R.array.home_bedroom_q9_anim08
            , R.array.home_bedroom_q9_anim09
            , R.array.home_bedroom_q9_anim10
    }, {
            R.array.home_bedroom_q10_anim01
            , R.array.home_bedroom_q10_anim02
            , R.array.home_bedroom_q10_anim03
            , R.array.home_bedroom_q10_anim04
            , R.array.home_bedroom_q10_anim05
            , R.array.home_bedroom_q10_anim06
            , R.array.home_bedroom_q10_anim07
            , R.array.home_bedroom_q10_anim08
            , R.array.home_bedroom_q10_anim09
            , R.array.home_bedroom_q10_anim10
    }, {
            R.array.home_bedroom_q11_anim01
            , R.array.home_bedroom_q11_anim02
            , R.array.home_bedroom_q11_anim03
            , R.array.home_bedroom_q11_anim04
            , R.array.home_bedroom_q11_anim05
            , R.array.home_bedroom_q11_anim06
            , R.array.home_bedroom_q11_anim07
            , R.array.home_bedroom_q11_anim08
            , R.array.home_bedroom_q11_anim09
            , R.array.home_bedroom_q11_anim10
    }, {
            R.array.home_bedroom_q12_anim01
            , R.array.home_bedroom_q12_anim02
            , R.array.home_bedroom_q12_anim03
            , R.array.home_bedroom_q12_anim04
            , R.array.home_bedroom_q12_anim05
            , R.array.home_bedroom_q12_anim06
            , R.array.home_bedroom_q12_anim07
            , R.array.home_bedroom_q12_anim08
            , R.array.home_bedroom_q12_anim09
            , R.array.home_bedroom_q12_anim10
    }, {
            R.array.home_garden_q13_anim01
            , R.array.home_garden_q13_anim02
            , R.array.home_garden_q13_anim03
            , R.array.home_garden_q13_anim04
            , R.array.home_garden_q13_anim05
            , R.array.home_garden_q13_anim06
            , R.array.home_garden_q13_anim07
            , R.array.home_garden_q13_anim08
            , R.array.home_garden_q13_anim09
            , R.array.home_garden_q13_anim10
    }, {
            R.array.home_garden_q14_anim01
            , R.array.home_garden_q14_anim02
            , R.array.home_garden_q14_anim03
            , R.array.home_garden_q14_anim04
            , R.array.home_garden_q14_anim05
            , R.array.home_garden_q14_anim06
            , R.array.home_garden_q14_anim07
            , R.array.home_garden_q14_anim08
            , R.array.home_garden_q14_anim09
            , R.array.home_garden_q14_anim10
    }, {
            R.array.home_garden_q15_anim01
            , R.array.home_garden_q15_anim02
            , R.array.home_garden_q15_anim03
            , R.array.home_garden_q15_anim04
            , R.array.home_garden_q15_anim05
            , R.array.home_garden_q15_anim06
            , R.array.home_garden_q15_anim07
            , R.array.home_garden_q15_anim08
            , R.array.home_garden_q15_anim09
            , R.array.home_garden_q15_anim10
    }, {
            R.array.home_garden_q16_anim01
            , R.array.home_garden_q16_anim02
            , R.array.home_garden_q16_anim03
            , R.array.home_garden_q16_anim04
            , R.array.home_garden_q16_anim05
            , R.array.home_garden_q16_anim06
            , R.array.home_garden_q16_anim07
            , R.array.home_garden_q16_anim08
            , R.array.home_garden_q16_anim09
            , R.array.home_garden_q16_anim10
    }, {
            R.array.city_transportation_q17_anim01
            , R.array.city_transportation_q17_anim02
            , R.array.city_transportation_q17_anim03
            , R.array.city_transportation_q17_anim04
            , R.array.city_transportation_q17_anim05
            , R.array.city_transportation_q17_anim06
            , R.array.city_transportation_q17_anim07
            , R.array.city_transportation_q17_anim08
            , R.array.city_transportation_q17_anim09
            , R.array.city_transportation_q17_anim10
    }, {
            R.array.city_transportation_q18_anim01
            , R.array.city_transportation_q18_anim02
            , R.array.city_transportation_q18_anim03
            , R.array.city_transportation_q18_anim04
            , R.array.city_transportation_q18_anim05
            , R.array.city_transportation_q18_anim06
            , R.array.city_transportation_q18_anim07
            , R.array.city_transportation_q18_anim08
            , R.array.city_transportation_q18_anim09
            , R.array.city_transportation_q18_anim10
    }, {
            R.array.city_transportation_q19_anim01
            , R.array.city_transportation_q19_anim02
            , R.array.city_transportation_q19_anim03
            , R.array.city_transportation_q19_anim04
            , R.array.city_transportation_q19_anim05
            , R.array.city_transportation_q19_anim06
            , R.array.city_transportation_q19_anim07
            , R.array.city_transportation_q19_anim08
            , R.array.city_transportation_q19_anim09
            , R.array.city_transportation_q19_anim10
    }, {
            R.array.city_transportation_q20_anim01
            , R.array.city_transportation_q20_anim02
            , R.array.city_transportation_q20_anim03
            , R.array.city_transportation_q20_anim04
            , R.array.city_transportation_q20_anim05
            , R.array.city_transportation_q20_anim06
            , R.array.city_transportation_q20_anim07
            , R.array.city_transportation_q20_anim08
            , R.array.city_transportation_q20_anim09
            , R.array.city_transportation_q20_anim10
    }
    };

    private int[] anims = {
            R.string.gif_anim_q01
            , R.string.gif_anim_q02
            , R.string.gif_anim_q03
            , R.string.gif_anim_q04
            , R.string.gif_anim_q05
            , R.string.gif_anim_q06
            , R.string.gif_anim_q07
            , R.string.gif_anim_q08
            , R.string.gif_anim_q09
            , R.string.gif_anim_q10
            , R.string.gif_anim_q11
            , R.string.gif_anim_q12
            , R.string.gif_anim_q13
            , R.string.gif_anim_q14
            , R.string.gif_anim_q15
            , R.string.gif_anim_q16
            , R.string.gif_anim_q17a
            , R.string.gif_anim_q18
            , R.string.gif_anim_q19
            , R.string.gif_anim_q20
            , R.string.gif_anim_q21
            , R.string.gif_anim_q22
            , R.string.gif_anim_q23
            , R.string.gif_anim_q24a
            , R.string.gif_anim_q25
            , R.string.gif_anim_q26
            , R.string.gif_anim_q27a
            , R.string.gif_anim_q28
            , R.string.gif_anim_q29
            , R.string.gif_anim_q30
            , R.string.gif_anim_q31
            , R.string.gif_anim_q32
            , R.string.gif_anim_q33a
            , R.string.gif_anim_q34a
            , R.string.gif_anim_q35a
            , R.string.gif_anim_q36
            , R.string.gif_anim_q37
            , R.string.gif_anim_q38
            , R.string.gif_anim_q39
            , R.string.gif_anim_q40
            , R.string.gif_anim_q41
            , R.string.gif_anim_q42
            , R.string.gif_anim_q43
            , R.string.gif_anim_q44
            , R.string.gif_anim_q45
            , R.string.gif_anim_q46
            , R.string.gif_anim_q47
            , R.string.gif_anim_q48
            , R.string.gif_anim_q49a
            , R.string.gif_anim_q50a
            , R.string.gif_anim_q51
            , R.string.gif_anim_q52a
            , R.string.gif_anim_q53a
            , R.string.gif_anim_q54a
            , R.string.gif_anim_q55
            , R.string.gif_anim_q56
            , R.string.gif_anim_q57a
            , R.string.gif_anim_q58
    };

    private int[] bgs = {
            R.drawable.fr_my_home_kitchen_01_bkg
            , R.drawable.fr_my_home_kitchen_02_bkg
            , R.drawable.fr_my_home_kitchen_03a_bkg
            , R.drawable.fr_my_home_kitchen_04_bkg

            , R.drawable.animr05__bkg
            , R.drawable.animr06__bkg
            , R.drawable.animr07__bkg
            , R.drawable.animr08__bkg

            , R.drawable.fr__q03_my_home_bedroom_01_bkg
            , R.drawable.fr__q03_my_home_bedroom_02_bkg
            , R.drawable.fr__q03_my_home_bedroom_03_bkg
            , R.drawable.fr__q03_my_home_bedroom_04_bkg

            , R.drawable.fr__q04_my_home_garden_01_bkg
            , R.drawable.fr__q04_my_home_garden_02a_bkg
            , R.drawable.fr__q04_my_home_garden_03_bkg
            , R.drawable.fr__q04_my_home_garden_04_bkg

            , R.drawable.animr017__bkg
            , R.drawable.animr018__bkg
            , R.drawable.animr019__bkg
            , R.drawable.animr020__bkg

            , R.drawable.animr021__bkg
            , R.drawable.animr022__bkg
            , R.drawable.animr023__bkg
            , R.drawable.animr024__bkg

            , R.drawable.animr025__bkg
            , R.drawable.animr026__bkg
            , R.drawable.animr027__bkg
            , R.drawable.animr028__bkg

            , R.drawable.animr029__bkg
            , R.drawable.animr030__bkg
            , R.drawable.animr031__bkg
            , R.drawable.animr032__bkg

            , R.drawable.animr033__bkg
            , R.drawable.animr034__bkg
            , R.drawable.animr035a__bkg
            , R.drawable.animr036__bkg

            , R.drawable.animr037__bkg
            , R.drawable.animr038__bkg
            , R.drawable.animr039__bkg
            , R.drawable.animr040__bkg

            , R.drawable.animr041__bkg
            , R.drawable.animr042__bkg
            , R.drawable.animr043__bkg
            , R.drawable.animr044__bkg

            , R.drawable.animr045__bkg
            , R.drawable.animr046__bkg
            , R.drawable.animr047__bkg
            , R.drawable.animr048__bkg

            , R.drawable.animr049__bkg
            , R.drawable.animr050__bkg
            , R.drawable.animr051__bkg
            , R.drawable.animr052__bkg

            , R.drawable.animr053__bkg
            , R.drawable.animr054__bkg
            , R.drawable.animr055__bkg
            , R.drawable.animr056__bkg

            , R.drawable.animr057__bkg
            , R.drawable.animr058__bkg
    };

    private int[] fgs = {
            R.drawable.fr_my_home_kitchen_01_image_normal
            , R.drawable.fr_my_home_kitchen_02_image_normal
            , R.drawable.fr_my_home_kitchen_03_image_normal
            , R.drawable.fr_my_home_kitchen_04_image_normal

            , R.drawable.animr05__image
            , R.drawable.animr06__image
            , R.drawable.animr07__image
            , R.drawable.animr08__image

            , R.drawable.fr__q03_my_home_bedroom_01_image_normal
            , R.drawable.fr__q03_my_home_bedroom_02_image_normal
            , R.drawable.fr__q03_my_home_bedroom_03_image_normal
            , R.drawable.fr__q03_my_home_bedroom_04_image_normal

            , R.drawable.fr__q04_my_home_garden_01_image_normal
            , R.drawable.fr__q04_my_home_garden_02_image_normal
            , R.drawable.fr__q04_my_home_garden_03_image_normal
            , R.drawable.fr__q04_my_home_garden_04_image_normal

            , R.drawable.animr017__image
            , R.drawable.animr018_image
            , R.drawable.animr019__image
            , R.drawable.animr020__image

            , R.drawable.animr021__image
            , R.drawable.animr022__image
            , R.drawable.animr023__image
            , R.drawable.animr024__image

            , R.drawable.animr025__image
            , R.drawable.animr026__image
            , R.drawable.animr027__image
            , R.drawable.animr028__image

            , R.drawable.animr029__image
            , R.drawable.animr030__image
            , R.drawable.animr031__image
            , R.drawable.animr032__image

            , R.drawable.animr033__image
            , R.drawable.animr034__image
            , R.drawable.animr035a__image
            , R.drawable.animr036__image

            , R.drawable.animr037__image
            , R.drawable.animr038__image
            , R.drawable.animr039__image
            , R.drawable.animr040__image

            , R.drawable.animr041__image
            , R.drawable.animr042__image
            , R.drawable.animr043__image
            , R.drawable.animr044__image

            , R.drawable.animr045__image
            , R.drawable.animr046__image
            , R.drawable.animr047__image
            , R.drawable.animr048__image

            , R.drawable.animr049__image
            , R.drawable.animr050__image
            , R.drawable.animr051__image
            , R.drawable.animr052__image

            , R.drawable.animr053__image
            , R.drawable.animr054__image
            , R.drawable.animr055__image
            , R.drawable.animr056__image

            , R.drawable.animr057__image
            , R.drawable.animr058__image
    };

    private int[] txt_frs = {
            R.drawable.fr_my_home_kitchen_01_text
            , R.drawable.fr_my_home_kitchen_02_text
            , R.drawable.fr_my_home_kitchen_03a_text
            , R.drawable.fr_my_home_kitchen_04_text_01

            , R.drawable.animr05__fr
            , R.drawable.animr06__fr
            , R.drawable.animr07__fr
            , R.drawable.animr08__fr

            , R.drawable.fr__q03_my_home_bedroom_01_text
            , R.drawable.fr__q03_my_home_bedroom_02_text
            , R.drawable.fr__q03_my_home_bedroom_03_text
            , R.drawable.fr__q03_my_home_bedroom_04_text

            , R.drawable.fr__q04_my_home_garden_01_text
            , R.drawable.fr__q04_my_home_garden_02a_text
            , R.drawable.fr__q04_my_home_garden_03_text
            , R.drawable.fr__q04_my_home_garden_04_text

            , R.drawable.animr017__fr
            , R.drawable.animr018__fr
            , R.drawable.animr019__fr
            , R.drawable.animr020__fr

            , R.drawable.animr021__fr
            , R.drawable.animr022__fr
            , R.drawable.animr023__fr
            , R.drawable.animr024__fr

            , R.drawable.animr025__fr
            , R.drawable.animr026__fr
            , R.drawable.animr027__fr
            , R.drawable.animr028__fr

            , R.drawable.animr029__fr
            , R.drawable.animr030__fr
            , R.drawable.animr031__fr
            , R.drawable.animr032__fr

            , R.drawable.animr033__fr
            , R.drawable.animr034__fr
            , R.drawable.animr035a__fr
            , R.drawable.animr036__fr

            , R.drawable.animr037__fr
            , R.drawable.animr038__fr
            , R.drawable.animr039__fr
            , R.drawable.animr040__fr

            , R.drawable.animr041__fr
            , R.drawable.animr042__fr
            , R.drawable.animr043__fr
            , R.drawable.animr044__fr

            , R.drawable.animr045__fr
            , R.drawable.animr046__fr
            , R.drawable.animr047__fr
            , R.drawable.animr048__fr

            , R.drawable.animr049__fr
            , R.drawable.animr050__fr
            , R.drawable.animr051__fr
            , R.drawable.animr052__fr

            , R.drawable.animr053__fr
            , R.drawable.animr054__fr
            , R.drawable.animr055__fr
            , R.drawable.animr056__fr

            , R.drawable.animr057__fr
            , R.drawable.animr058__fr
    };

    private int[][] greens = {
            {
                    R.drawable.fr_my_home_kitchen_01_cravate_green
                    , R.drawable.fr_my_home_kitchen_01_lepingle_green
                    , R.drawable.fr_my_home_kitchen_01_chausse_pied_green
                    , R.drawable.fr_my_home_kitchen_01_bijou_green
                    , R.drawable.fr_my_home_kitchen_01_maquillage_green
                    , R.drawable.fr_my_home_kitchen_01_fouet_green
                    , R.drawable.fr_my_home_kitchen_01_cocotte_minute_green
                    , R.drawable.fr_my_home_kitchen_01_lepluche_legumes_green
                    , R.drawable.fr_my_home_kitchen_01_lecumoire_green
                    , R.drawable.fr_my_home_kitchen_01_passoire_green
            }, {
            R.drawable.fr_my_home_kitchen_02_leau_green
            , R.drawable.fr_my_home_kitchen_02_lait_green_01
            , R.drawable.fr_my_home_kitchen_02_huile_green
            , R.drawable.fr_my_home_kitchen_02_vinaigre_green
            , R.drawable.fr_my_home_kitchen_02_sucre_green
            , R.drawable.fr_my_home_kitchen_02_farine_green
            , R.drawable.fr_my_home_kitchen_02_sel_green
            , R.drawable.fr_my_home_kitchen_02_poivre_green
            , R.drawable.fr_my_home_kitchen_02_beurre_green
            , R.drawable.fr_my_home_kitchen_02_moutarde_green
    }, {
            R.drawable.fr_my_home_kitchen_03_lorange_green
            , R.drawable.fr_my_home_kitchen_03_pomme_green
            , R.drawable.fr_my_home_kitchen_03_fraise_green
            , R.drawable.fr_my_home_kitchen_03_banane_green
            , R.drawable.fr_my_home_kitchen_03_poire_green
            , R.drawable.fr_my_home_kitchen_03_chou_green
            , R.drawable.fr_my_home_kitchen_03_poireau_green
            , R.drawable.fr_my_home_kitchen_03_pomme_de_terre_green
            , R.drawable.fr_my_home_kitchen_03_carotte_green
            , R.drawable.fr_my_home_kitchen_03_concombre_green
    }, {
            R.drawable.fr_my_home_kitchen_04_plat_green
            , R.drawable.fr_my_home_kitchen_04_cuillere_green
            , R.drawable.fr_my_home_kitchen_04_verre_green
            , R.drawable.fr_my_home_kitchen_04_fourchette_green
            , R.drawable.fr_my_home_kitchen_04_bol_green
            , R.drawable.fr_my_home_kitchen_04_serviette_green
            , R.drawable.fr_my_home_kitchen_04_couteau_green
            , R.drawable.fr_my_home_kitchen_04_tasse_green
            , R.drawable.fr_my_home_kitchen_04_lassiette_green
            , R.drawable.fr_my_home_kitchen_04_marteau_green
    }, {
            R.drawable.animr05_green_01
            , R.drawable.animr05_green_02
            , R.drawable.animr05_green_03
            , R.drawable.animr05_green_04
            , R.drawable.animr05_green_05
            , R.drawable.animr05_green_06
            , R.drawable.animr05_green_07
            , R.drawable.animr05_green_08
            , R.drawable.animr05_green_09
            , R.drawable.animr05_green_10
    }, {
            R.drawable.animr06_green_01
            , R.drawable.animr06_green_02
            , R.drawable.animr06_green_03
            , R.drawable.animr06_green_04
            , R.drawable.animr06_green_05
            , R.drawable.animr06_green_06
            , R.drawable.animr06_green_07
            , R.drawable.animr06_green_08
            , R.drawable.animr06_green_09
            , R.drawable.animr06_green_10

    }, {
            R.drawable.animr07_green_01
            , R.drawable.animr07_green_02
            , R.drawable.animr07_green_03
            , R.drawable.animr07_green_04
            , R.drawable.animr07_green_05
            , R.drawable.animr07_green_06
            , R.drawable.animr07_green_07
            , R.drawable.animr07_green_08
            , R.drawable.animr07_green_09
            , R.drawable.animr07_green_10
    }, {
            R.drawable.animr08_green_01
            , R.drawable.animr08_green_02
            , R.drawable.animr08_green_03
            , R.drawable.animr08_green_04
            , R.drawable.animr08_green_05
            , R.drawable.animr08_green_06
            , R.drawable.animr08_green_07
            , R.drawable.animr08_green_08
            , R.drawable.animr08_green_09
            , R.drawable.animr08_green_10
    }, {
            R.drawable.fr_q03_my_home_bedroom_01_posa_green
            , R.drawable.fr_q03_my_home_bedroom_01_posb_green
            , R.drawable.fr_q03_my_home_bedroom_01_posc_green
            , R.drawable.fr_q03_my_home_bedroom_01_posd_green
            , R.drawable.fr_q03_my_home_bedroom_01_pose_green
            , R.drawable.fr_q03_my_home_bedroom_01_posf_green
            , R.drawable.fr_q03_my_home_bedroom_01_posg_green
            , R.drawable.fr_q03_my_home_bedroom_01_posh_green
            , R.drawable.fr_q03_my_home_bedroom_01_posi_green
            , R.drawable.fr_q03_my_home_bedroom_01_posj_green
    }, {
            R.drawable.fr_q03_my_home_bedroom_02_posa_green
            , R.drawable.fr_q03_my_home_bedroom_02_posb_green
            , R.drawable.fr_q03_my_home_bedroom_02_posc_green
            , R.drawable.fr_q03_my_home_bedroom_02_posd_green
            , R.drawable.fr_q03_my_home_bedroom_02_pose_green
            , R.drawable.fr_q03_my_home_bedroom_02_posf_green
            , R.drawable.fr_q03_my_home_bedroom_02_posg_green
            , R.drawable.fr_q03_my_home_bedroom_02_posh_green
            , R.drawable.fr_q03_my_home_bedroom_02_posi_green
            , R.drawable.fr_q03_my_home_bedroom_02_posj_green
    }, {
            R.drawable.fr_q03_my_home_bedroom_03_posa_green
            , R.drawable.fr_q03_my_home_bedroom_03_posb_green
            , R.drawable.fr_q03_my_home_bedroom_03_posc_green
            , R.drawable.fr_q03_my_home_bedroom_03_posd_green
            , R.drawable.fr_q03_my_home_bedroom_03_pose_green
            , R.drawable.fr_q03_my_home_bedroom_03_posf_green
            , R.drawable.fr_q03_my_home_bedroom_03_posg_green
            , R.drawable.fr_q03_my_home_bedroom_03_posh_green
            , R.drawable.fr_q03_my_home_bedroom_03_posi_green
            , R.drawable.fr_q03_my_home_bedroom_03_posj_green
    }, {
            R.drawable.fr_q03_my_home_bedroom_04_posa_green
            , R.drawable.fr_q03_my_home_bedroom_04_posb_green
            , R.drawable.fr_q03_my_home_bedroom_04_posc_green
            , R.drawable.fr_q03_my_home_bedroom_04_posd_green
            , R.drawable.fr_q03_my_home_bedroom_04_pose_green
            , R.drawable.fr_q03_my_home_bedroom_04_posf_green
            , R.drawable.fr_q03_my_home_bedroom_04_posg_green
            , R.drawable.fr_q03_my_home_bedroom_04_posh_green
            , R.drawable.fr_q03_my_home_bedroom_04_posi_green
            , R.drawable.fr_q03_my_home_bedroom_04_posj_green
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_green
            , R.drawable.fr_q04_my_home_garden_01_posb_green
            , R.drawable.fr_q04_my_home_garden_01_posc_green
            , R.drawable.fr_q04_my_home_garden_01_posd_green
            , R.drawable.fr_q04_my_home_garden_01_pose_green
            , R.drawable.fr_q04_my_home_garden_01_posf_green
            , R.drawable.fr_q04_my_home_garden_01_posg_green
            , R.drawable.fr_q04_my_home_garden_01_posh_green
            , R.drawable.fr_q04_my_home_garden_01_posi_green
            , R.drawable.fr_q04_my_home_garden_01_posj_green
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_green
            , R.drawable.fr_q04_my_home_garden_01_posb_green
            , R.drawable.fr_q04_my_home_garden_01_posc_green
            , R.drawable.fr_q04_my_home_garden_01_posd_green
            , R.drawable.fr_q04_my_home_garden_01_pose_green
            , R.drawable.fr_q04_my_home_garden_01_posf_green
            , R.drawable.fr_q04_my_home_garden_01_posg_green
            , R.drawable.fr_q04_my_home_garden_01_posh_green
            , R.drawable.fr_q04_my_home_garden_01_posi_green
            , R.drawable.fr_q04_my_home_garden_01_posj_green
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_green
            , R.drawable.fr_q04_my_home_garden_01_posb_green
            , R.drawable.fr_q04_my_home_garden_01_posc_green
            , R.drawable.fr_q04_my_home_garden_01_posd_green
            , R.drawable.fr_q04_my_home_garden_01_pose_green
            , R.drawable.fr_q04_my_home_garden_01_posf_green
            , R.drawable.fr_q04_my_home_garden_01_posg_green
            , R.drawable.fr_q04_my_home_garden_01_posh_green
            , R.drawable.fr_q04_my_home_garden_01_posi_green
            , R.drawable.fr_q04_my_home_garden_01_posj_green
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_green
            , R.drawable.fr_q04_my_home_garden_01_posb_green
            , R.drawable.fr_q04_my_home_garden_01_posc_green
            , R.drawable.fr_q04_my_home_garden_01_posd_green
            , R.drawable.fr_q04_my_home_garden_01_pose_green
            , R.drawable.fr_q04_my_home_garden_01_posf_green
            , R.drawable.fr_q04_my_home_garden_01_posg_green
            , R.drawable.fr_q04_my_home_garden_01_posh_green
            , R.drawable.fr_q04_my_home_garden_01_posi_green
            , R.drawable.fr_q04_my_home_garden_01_posj_green
    }, {
            R.drawable.animr017_green_01
            , R.drawable.animr017_green_02
            , R.drawable.animr017_green_03
            , R.drawable.animr017_green_04
            , R.drawable.animr017_green_05
            , R.drawable.animr017_green_06
            , R.drawable.animr017_green_07
            , R.drawable.animr017_green_08
            , R.drawable.animr017_green_09
            , R.drawable.animr017_green_10
    }, {
            R.drawable.animr018_green_01
            , R.drawable.animr018_green_02
            , R.drawable.animr018_green_03
            , R.drawable.animr018_green_04
            , R.drawable.animr018_green_05
            , R.drawable.animr018_green_06
            , R.drawable.animr018_green_07
            , R.drawable.animr018_green_08
            , R.drawable.animr018_green_09
            , R.drawable.animr018_green_10
    }, {
            R.drawable.animr019_green_01
            , R.drawable.animr019_green_02
            , R.drawable.animr019_green_03
            , R.drawable.animr019_green_04
            , R.drawable.animr019_green_05
            , R.drawable.animr019_green_06
            , R.drawable.animr019_green_07
            , R.drawable.animr019_green_08
            , R.drawable.animr019_green_09
            , R.drawable.animr019_green_10
    }, {
            R.drawable.animr020_green_01
            , R.drawable.animr020_green_02
            , R.drawable.animr020_green_03
            , R.drawable.animr020_green_04
            , R.drawable.animr020_green_05
            , R.drawable.animr020_green_06
            , R.drawable.animr020_green_07
            , R.drawable.animr020_green_08
            , R.drawable.animr020_green_09
            , R.drawable.animr020_green_10
    }, {
            R.drawable.animr021_green_01
            , R.drawable.animr021_green_02
            , R.drawable.animr021_green_03
            , R.drawable.animr021_green_04
            , R.drawable.animr021_green_05
            , R.drawable.animr021_green_06
            , R.drawable.animr021_green_07
            , R.drawable.animr021_green_08
            , R.drawable.animr021_green_09
            , R.drawable.animr021_green_10
    }, {
            R.drawable.animr022_green_01
            , R.drawable.animr022_green_02
            , R.drawable.animr022_green_03
            , R.drawable.animr022_green_04
            , R.drawable.animr022_green_05
            , R.drawable.animr022_green_06
            , R.drawable.animr022_green_07
            , R.drawable.animr022_green_08
            , R.drawable.animr022_green_09
            , R.drawable.animr022_green_10
    }, {
            R.drawable.animr023_green_01
            , R.drawable.animr023_green_02
            , R.drawable.animr023_green_03
            , R.drawable.animr023_green_04
            , R.drawable.animr023_green_05
            , R.drawable.animr023_green_06
            , R.drawable.animr023_green_07
            , R.drawable.animr023_green_08
            , R.drawable.animr023_green_09
            , R.drawable.animr023_green_10
    }, {
            R.drawable.animr024_green_01
            , R.drawable.animr024_green_02
            , R.drawable.animr024_green_03
            , R.drawable.animr024_green_04
            , R.drawable.animr024_green_05
            , R.drawable.animr024_green_06
            , R.drawable.animr024_green_07
            , R.drawable.animr024_green_08
            , R.drawable.animr024_green_09
            , R.drawable.animr024_green_10
    }, {
            R.drawable.animr025_green_01
            , R.drawable.animr025_green_02
            , R.drawable.animr025_green_03
            , R.drawable.animr025_green_04
            , R.drawable.animr025_green_05
            , R.drawable.animr025_green_06
            , R.drawable.animr025_green_07
            , R.drawable.animr025_green_08
            , R.drawable.animr025_green_09
            , R.drawable.animr025_green_10
    }, {
            R.drawable.animr026_green_01
            , R.drawable.animr026_green_02
            , R.drawable.animr026_green_03
            , R.drawable.animr026_green_04
            , R.drawable.animr026_green_05
            , R.drawable.animr026_green_06
            , R.drawable.animr026_green_07
            , R.drawable.animr026_green_08
            , R.drawable.animr026_green_09
            , R.drawable.animr026_green_10
    }, {
            R.drawable.animr027_green_01
            , R.drawable.animr027_green_02
            , R.drawable.animr027_green_03
            , R.drawable.animr027_green_04
            , R.drawable.animr027_green_05
            , R.drawable.animr027_green_06
            , R.drawable.animr027_green_07
            , R.drawable.animr027_green_08
            , R.drawable.animr027_green_09
            , R.drawable.animr027_green_10
    }, {
            R.drawable.animr028_green_01
            , R.drawable.animr028_green_02
            , R.drawable.animr028_green_03
            , R.drawable.animr028_green_04
            , R.drawable.animr028_green_05
            , R.drawable.animr028_green_06
            , R.drawable.animr028_green_07
            , R.drawable.animr028_green_08
            , R.drawable.animr028_green_09
            , R.drawable.animr028_green_10
    }, {
            R.drawable.animr029_green_01
            , R.drawable.animr029_green_02
            , R.drawable.animr029_green_03
            , R.drawable.animr029_green_04
            , R.drawable.animr029_green_05
            , R.drawable.animr029_green_06
            , R.drawable.animr029_green_07
            , R.drawable.animr029_green_08
            , R.drawable.animr029_green_09
            , R.drawable.animr029_green_10
    }, {
            R.drawable.animr030_green_01
            , R.drawable.animr030_green_02
            , R.drawable.animr030_green_03
            , R.drawable.animr030_green_04
            , R.drawable.animr030_green_05
            , R.drawable.animr030_green_06
            , R.drawable.animr030_green_07
            , R.drawable.animr030_green_08
            , R.drawable.animr030_green_09
            , R.drawable.animr030_green_10
    }, {
            R.drawable.animr031_green_01
            , R.drawable.animr031_green_02
            , R.drawable.animr031_green_03
            , R.drawable.animr031_green_04
            , R.drawable.animr031_green_05
            , R.drawable.animr031_green_06
            , R.drawable.animr031_green_07
            , R.drawable.animr031_green_08
            , R.drawable.animr031_green_09
            , R.drawable.animr031_green_10
    }, {
            R.drawable.animr032_green_01
            , R.drawable.animr032_green_02
            , R.drawable.animr032_green_03
            , R.drawable.animr032_green_04
            , R.drawable.animr032_green_05
            , R.drawable.animr032_green_06
            , R.drawable.animr032_green_07
            , R.drawable.animr032_green_08
            , R.drawable.animr032_green_09
            , R.drawable.animr032_green_10
    }, {
            R.drawable.animr033_green_01
            , R.drawable.animr033_green_02
            , R.drawable.animr033_green_03
            , R.drawable.animr033_green_04
            , R.drawable.animr033_green_05
            , R.drawable.animr033_green_06
            , R.drawable.animr033_green_07
            , R.drawable.animr033_green_08
            , R.drawable.animr033_green_09
            , R.drawable.animr033_green_10
    }, {
            R.drawable.animr034_green_01
            , R.drawable.animr034_green_02
            , R.drawable.animr034_green_03
            , R.drawable.animr034_green_04
            , R.drawable.animr034_green_05
            , R.drawable.animr034_green_06
            , R.drawable.animr034_green_07
            , R.drawable.animr034_green_08
            , R.drawable.animr034_green_09
            , R.drawable.animr034_green_10
    }, {
            R.drawable.animr035a_green_01
            , R.drawable.animr035a_green_02
            , R.drawable.animr035a_green_03
            , R.drawable.animr035a_green_04
            , R.drawable.animr035a_green_05
            , R.drawable.animr035a_green_06
            , R.drawable.animr035a_green_07
            , R.drawable.animr035a_green_08
            , R.drawable.animr035a_green_09
            , R.drawable.animr035a_green_10
    }, {
            R.drawable.animr036_green_01
            , R.drawable.animr036_green_02
            , R.drawable.animr036_green_03
            , R.drawable.animr036_green_04
            , R.drawable.animr036_green_05
            , R.drawable.animr036_green_06
            , R.drawable.animr036_green_07
            , R.drawable.animr036_green_08
            , R.drawable.animr036_green_09
            , R.drawable.animr036_green_10
    }, {
            R.drawable.animr037_green_01
            , R.drawable.animr037_green_02
            , R.drawable.animr037_green_03
            , R.drawable.animr037_green_04
            , R.drawable.animr037_green_05
            , R.drawable.animr037_green_06
            , R.drawable.animr037_green_07
            , R.drawable.animr037_green_08
            , R.drawable.animr037_green_09
            , R.drawable.animr037_green_10
    }, {
            R.drawable.animr038_green_01
            , R.drawable.animr038_green_02
            , R.drawable.animr038_green_03
            , R.drawable.animr038_green_04
            , R.drawable.animr038_green_05
            , R.drawable.animr038_green_06
            , R.drawable.animr038_green_07
            , R.drawable.animr038_green_08
            , R.drawable.animr038_green_09
            , R.drawable.animr038_green_10
    }, {
            R.drawable.animr039_green_01
            , R.drawable.animr039_green_02
            , R.drawable.animr039_green_03
            , R.drawable.animr039_green_04
            , R.drawable.animr039_green_05
            , R.drawable.animr039_green_06
            , R.drawable.animr039_green_07
            , R.drawable.animr039_green_08
            , R.drawable.animr039_green_09
            , R.drawable.animr039_green_10
    }, {
            R.drawable.animr040_green_01
            , R.drawable.animr040_green_02
            , R.drawable.animr040_green_03
            , R.drawable.animr040_green_04
            , R.drawable.animr040_green_05
            , R.drawable.animr040_green_06
            , R.drawable.animr040_green_07
            , R.drawable.animr040_green_08
            , R.drawable.animr040_green_09
            , R.drawable.animr040_green_10
    }, {
            R.drawable.animr041_green_01
            , R.drawable.animr041_green_02
            , R.drawable.animr041_green_03
            , R.drawable.animr041_green_04
            , R.drawable.animr041_green_05
            , R.drawable.animr041_green_06
            , R.drawable.animr041_green_07
            , R.drawable.animr041_green_08
            , R.drawable.animr041_green_09
            , R.drawable.animr041_green_10
    }, {
            R.drawable.animr042_green_01
            , R.drawable.animr042_green_02
            , R.drawable.animr042_green_03
            , R.drawable.animr042_green_04
            , R.drawable.animr042_green_05
            , R.drawable.animr042_green_06
            , R.drawable.animr042_green_07
            , R.drawable.animr042_green_08
            , R.drawable.animr042_green_09
            , R.drawable.animr042_green_10
    }, {
            R.drawable.animr043_green_01
            , R.drawable.animr043_green_02
            , R.drawable.animr043_green_03
            , R.drawable.animr043_green_04
            , R.drawable.animr043_green_05
            , R.drawable.animr043_green_06
            , R.drawable.animr043_green_07
            , R.drawable.animr043_green_08
            , R.drawable.animr043_green_09
            , R.drawable.animr043_green_10
    }, {
            R.drawable.animr044_green_01
            , R.drawable.animr044_green_02
            , R.drawable.animr044_green_03
            , R.drawable.animr044_green_04
            , R.drawable.animr044_green_05
            , R.drawable.animr044_green_06
            , R.drawable.animr044_green_07
            , R.drawable.animr044_green_08
            , R.drawable.animr044_green_09
            , R.drawable.animr044_green_10
    }, {
            R.drawable.animr045_green_01
            , R.drawable.animr045_green_02
            , R.drawable.animr045_green_03
            , R.drawable.animr045_green_04
            , R.drawable.animr045_green_05
            , R.drawable.animr045_green_06
            , R.drawable.animr045_green_07
            , R.drawable.animr045_green_08
            , R.drawable.animr045_green_09
            , R.drawable.animr045_green_10
    }, {
            R.drawable.animr046_green_01
            , R.drawable.animr046_green_02
            , R.drawable.animr046_green_03
            , R.drawable.animr046_green_04
            , R.drawable.animr046_green_05
            , R.drawable.animr046_green_06
            , R.drawable.animr046_green_07
            , R.drawable.animr046_green_08
            , R.drawable.animr046_green_09
            , R.drawable.animr046_green_10
    }, {
            R.drawable.animr047_green_01
            , R.drawable.animr047_green_02
            , R.drawable.animr047_green_03
            , R.drawable.animr047_green_04
            , R.drawable.animr047_green_05
            , R.drawable.animr047_green_06
            , R.drawable.animr047_green_07
            , R.drawable.animr047_green_08
            , R.drawable.animr047_green_09
            , R.drawable.animr047_green_10
    }, {
            R.drawable.animr048_green_01
            , R.drawable.animr048_green_02
            , R.drawable.animr048_green_03
            , R.drawable.animr048_green_04
            , R.drawable.animr048_green_05
            , R.drawable.animr048_green_06
            , R.drawable.animr048_green_07
            , R.drawable.animr048_green_08
            , R.drawable.animr048_green_09
            , R.drawable.animr048_green_10
    }, {
            R.drawable.animr049_green_01
            , R.drawable.animr049_green_02
            , R.drawable.animr049_green_03
            , R.drawable.animr049_green_04
            , R.drawable.animr049_green_05
            , R.drawable.animr049_green_06
            , R.drawable.animr049_green_07
            , R.drawable.animr049_green_08
            , R.drawable.animr049_green_09
            , R.drawable.animr049_green_10
    }, {
            R.drawable.animr050_green_01
            , R.drawable.animr050_green_02
            , R.drawable.animr050_green_03
            , R.drawable.animr050_green_04
            , R.drawable.animr050_green_05
            , R.drawable.animr050_green_06
            , R.drawable.animr050_green_07
            , R.drawable.animr050_green_08
            , R.drawable.animr050_green_09
            , R.drawable.animr050_green_10
    }, {
            R.drawable.animr051_green_01
            , R.drawable.animr051_green_02
            , R.drawable.animr051_green_03
            , R.drawable.animr051_green_04
            , R.drawable.animr051_green_05
            , R.drawable.animr051_green_06
            , R.drawable.animr051_green_07
            , R.drawable.animr051_green_08
            , R.drawable.animr051_green_09
            , R.drawable.animr051_green_10
    }, {
            R.drawable.animr052_green_01
            , R.drawable.animr052_green_02
            , R.drawable.animr052_green_03
            , R.drawable.animr052_green_04
            , R.drawable.animr052_green_05
            , R.drawable.animr052_green_06
            , R.drawable.animr052_green_07
            , R.drawable.animr052_green_08
            , R.drawable.animr052_green_09
            , R.drawable.animr052_green_10
    }, {
            R.drawable.animr053_green_01
            , R.drawable.animr053_green_02
            , R.drawable.animr053_green_03
            , R.drawable.animr053_green_04
            , R.drawable.animr053_green_05
            , R.drawable.animr053_green_06
            , R.drawable.animr053_green_07
            , R.drawable.animr053_green_08
            , R.drawable.animr053_green_09
            , R.drawable.animr053_green_10
    }, {
            R.drawable.animr054_green_01
            , R.drawable.animr054_green_02
            , R.drawable.animr054_green_03
            , R.drawable.animr054_green_04
            , R.drawable.animr054_green_05
            , R.drawable.animr054_green_06
            , R.drawable.animr054_green_07
            , R.drawable.animr054_green_08
            , R.drawable.animr054_green_09
            , R.drawable.animr054_green_10
    }, {
            R.drawable.animr055_green_01
            , R.drawable.animr055_green_02
            , R.drawable.animr055_green_03
            , R.drawable.animr055_green_04
            , R.drawable.animr055_green_05
            , R.drawable.animr055_green_06
            , R.drawable.animr055_green_07
            , R.drawable.animr055_green_08
            , R.drawable.animr055_green_09
            , R.drawable.animr055_green_10
    }, {
            R.drawable.animr056_green_01
            , R.drawable.animr056_green_02
            , R.drawable.animr056_green_03
            , R.drawable.animr056_green_04
            , R.drawable.animr056_green_05
            , R.drawable.animr056_green_06
            , R.drawable.animr056_green_07
            , R.drawable.animr056_green_08
            , R.drawable.animr056_green_09
            , R.drawable.animr056_green_10
    }, {
            R.drawable.animr057_green_01
            , R.drawable.animr057_green_02
            , R.drawable.animr057_green_03
            , R.drawable.animr057_green_04
            , R.drawable.animr057_green_05
            , R.drawable.animr057_green_06
            , R.drawable.animr057_green_07
            , R.drawable.animr057_green_08
            , R.drawable.animr057_green_09
            , R.drawable.animr057_green_10
    }, {
            R.drawable.animr058_green_01
            , R.drawable.animr058_green_02
            , R.drawable.animr058_green_03
            , R.drawable.animr058_green_04
            , R.drawable.animr058_green_05
            , R.drawable.animr058_green_06
            , R.drawable.animr058_green_07
            , R.drawable.animr058_green_08
            , R.drawable.animr058_green_09
            , R.drawable.animr058_green_10
    }};

    private int[][] greys = {
            {
                    R.drawable.fr_my_home_kitchen_01_cravate_grey
                    , R.drawable.fr_my_home_kitchen_01_lepingle_grey
                    , R.drawable.fr_my_home_kitchen_01_chausse_pied_grey
                    , R.drawable.fr_my_home_kitchen_01_bijou_grey
                    , R.drawable.fr_my_home_kitchen_01_maquillage_grey
                    , R.drawable.fr_my_home_kitchen_01_fouet_grey
                    , R.drawable.fr_my_home_kitchen_01_cocotte_minute_grey1
                    , R.drawable.fr_my_home_kitchen_01_lepluche_legumes_grey
                    , R.drawable.fr_my_home_kitchen_01_lecumoire_grey
                    , R.drawable.fr_my_home_kitchen_01_passoire_grey
            }, {
            R.drawable.fr_my_home_kitchen_02_leau_grey
            , R.drawable.fr_my_home_kitchen_02_lait_grey_01
            , R.drawable.fr_my_home_kitchen_02_huile_grey
            , R.drawable.fr_my_home_kitchen_02_vinaigre_grey
            , R.drawable.fr_my_home_kitchen_02_sucre_grey
            , R.drawable.fr_my_home_kitchen_02_farine_grey
            , R.drawable.fr_my_home_kitchen_02_sel_grey
            , R.drawable.fr_my_home_kitchen_02_poivre_grey
            , R.drawable.fr_my_home_kitchen_02_beurre_grey
            , R.drawable.fr_my_home_kitchen_02_moutarde_grey
    }, {
            R.drawable.fr_my_home_kitchen_03_lorange_grey
            , R.drawable.fr_my_home_kitchen_03_pomme_grey
            , R.drawable.fr_my_home_kitchen_03_fraise_grey
            , R.drawable.fr_my_home_kitchen_03_banane_grey
            , R.drawable.fr_my_home_kitchen_03_poire_grey
            , R.drawable.fr_my_home_kitchen_03_chou_grey
            , R.drawable.fr_my_home_kitchen_03_poireau_grey
            , R.drawable.fr_my_home_kitchen_03_pomme_de_terre_grey
            , R.drawable.fr_my_home_kitchen_03_carotte_grey
            , R.drawable.fr_my_home_kitchen_03_concombre_grey
    }, {
            R.drawable.fr_my_home_kitchen_04_plat_grey
            , R.drawable.fr_my_home_kitchen_04_cuillere_grey
            , R.drawable.fr_my_home_kitchen_04_verre_grey
            , R.drawable.fr_my_home_kitchen_04_fourchette_grey
            , R.drawable.fr_my_home_kitchen_04_bol_grey
            , R.drawable.fr_my_home_kitchen_04_serviette_grey
            , R.drawable.fr_my_home_kitchen_04_couteau_grey
            , R.drawable.fr_my_home_kitchen_04_tasse_grey
            , R.drawable.fr_my_home_kitchen_04_lassiette_grey
            , R.drawable.fr_my_home_kitchen_04_marteau_grey
    }, {
            R.drawable.animr05_grey_01
            , R.drawable.animr05_grey_02
            , R.drawable.animr05_grey_03
            , R.drawable.animr05_grey_04
            , R.drawable.animr05_grey_05
            , R.drawable.animr05_grey_06
            , R.drawable.animr05_grey_07
            , R.drawable.animr05_grey_08
            , R.drawable.animr05_grey_09
            , R.drawable.animr05_grey_10
    }, {
            R.drawable.animr06_grey_01
            , R.drawable.animr06_grey_02
            , R.drawable.animr06_grey_03
            , R.drawable.animr06_grey_04
            , R.drawable.animr06_grey_05
            , R.drawable.animr06_grey_06
            , R.drawable.animr06_grey_07
            , R.drawable.animr06_grey_08
            , R.drawable.animr06_grey_09
            , R.drawable.animr06_grey_10
    }, {
            R.drawable.animr07_grey_01
            , R.drawable.animr07_grey_02
            , R.drawable.animr07_grey_03
            , R.drawable.animr07_grey_04
            , R.drawable.animr07_grey_05
            , R.drawable.animr07_grey_06
            , R.drawable.animr07_grey_07
            , R.drawable.animr07_grey_08
            , R.drawable.animr07_grey_09
            , R.drawable.animr07_grey_10
    }, {
            R.drawable.animr08_grey_01
            , R.drawable.animr08_grey_02
            , R.drawable.animr08_grey_03
            , R.drawable.animr08_grey_04
            , R.drawable.animr08_grey_05
            , R.drawable.animr08_grey_06
            , R.drawable.animr08_grey_07
            , R.drawable.animr08_grey_08
            , R.drawable.animr08_grey_09
            , R.drawable.animr08_grey_10
    }, {
            R.drawable.fr_q03_my_home_bedroom_01_posa_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posb_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posc_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posd_grey
            , R.drawable.fr_q03_my_home_bedroom_01_pose_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posf_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posg_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posh_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posi_grey
            , R.drawable.fr_q03_my_home_bedroom_01_posj_grey
    }, {
            R.drawable.fr_q03_my_home_bedroom_02_posa_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posb_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posc_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posd_grey
            , R.drawable.fr_q03_my_home_bedroom_02_pose_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posf_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posg_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posh_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posi_grey
            , R.drawable.fr_q03_my_home_bedroom_02_posj_grey
    }, {
            R.drawable.fr_q03_my_home_bedroom_03_posa_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posb_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posc_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posd_grey
            , R.drawable.fr_q03_my_home_bedroom_03_pose_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posf_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posg_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posh_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posi_grey
            , R.drawable.fr_q03_my_home_bedroom_03_posj_grey
    }, {
            R.drawable.fr_q03_my_home_bedroom_04_posa_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posb_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posc_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posd_grey
            , R.drawable.fr_q03_my_home_bedroom_04_pose_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posf_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posg_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posh_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posi_grey
            , R.drawable.fr_q03_my_home_bedroom_04_posj_grey
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_grey
            , R.drawable.fr_q04_my_home_garden_01_posb_grey
            , R.drawable.fr_q04_my_home_garden_01_posc_grey
            , R.drawable.fr_q04_my_home_garden_01_posd_grey
            , R.drawable.fr_q04_my_home_garden_01_pose_grey
            , R.drawable.fr_q04_my_home_garden_01_posf_grey
            , R.drawable.fr_q04_my_home_garden_01_posg_grey
            , R.drawable.fr_q04_my_home_garden_01_posh_grey
            , R.drawable.fr_q04_my_home_garden_01_posi_grey
            , R.drawable.fr_q04_my_home_garden_01_posj_grey
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_grey
            , R.drawable.fr_q04_my_home_garden_01_posb_grey
            , R.drawable.fr_q04_my_home_garden_01_posc_grey
            , R.drawable.fr_q04_my_home_garden_01_posd_grey
            , R.drawable.fr_q04_my_home_garden_01_pose_grey
            , R.drawable.fr_q04_my_home_garden_01_posf_grey
            , R.drawable.fr_q04_my_home_garden_01_posg_grey
            , R.drawable.fr_q04_my_home_garden_01_posh_grey
            , R.drawable.fr_q04_my_home_garden_01_posi_grey
            , R.drawable.fr_q04_my_home_garden_01_posj_grey
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_grey
            , R.drawable.fr_q04_my_home_garden_01_posb_grey
            , R.drawable.fr_q04_my_home_garden_01_posc_grey
            , R.drawable.fr_q04_my_home_garden_01_posd_grey
            , R.drawable.fr_q04_my_home_garden_01_pose_grey
            , R.drawable.fr_q04_my_home_garden_01_posf_grey
            , R.drawable.fr_q04_my_home_garden_01_posg_grey
            , R.drawable.fr_q04_my_home_garden_01_posh_grey
            , R.drawable.fr_q04_my_home_garden_01_posi_grey
            , R.drawable.fr_q04_my_home_garden_01_posj_grey
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_grey
            , R.drawable.fr_q04_my_home_garden_01_posb_grey
            , R.drawable.fr_q04_my_home_garden_01_posc_grey
            , R.drawable.fr_q04_my_home_garden_01_posd_grey
            , R.drawable.fr_q04_my_home_garden_01_pose_grey
            , R.drawable.fr_q04_my_home_garden_01_posf_grey
            , R.drawable.fr_q04_my_home_garden_01_posg_grey
            , R.drawable.fr_q04_my_home_garden_01_posh_grey
            , R.drawable.fr_q04_my_home_garden_01_posi_grey
            , R.drawable.fr_q04_my_home_garden_01_posj_grey
    }, {
            R.drawable.animr017_grey_01
            , R.drawable.animr017_grey_02
            , R.drawable.animr017_grey_03
            , R.drawable.animr017_grey_04
            , R.drawable.animr017_grey_05
            , R.drawable.animr017_grey_06
            , R.drawable.animr017_grey_07
            , R.drawable.animr017_grey_08
            , R.drawable.animr017_grey_09
            , R.drawable.animr017_grey_10
    }, {
            R.drawable.animr018_grey_01
            , R.drawable.animr018_grey_02
            , R.drawable.animr018_grey_03
            , R.drawable.animr018_grey_04
            , R.drawable.animr018_grey_05
            , R.drawable.animr018_grey_06
            , R.drawable.animr018_grey_07
            , R.drawable.animr018_grey_08
            , R.drawable.animr018_grey_09
            , R.drawable.animr018_grey_10
    }, {
            R.drawable.animr019_grey_01
            , R.drawable.animr019_grey_02
            , R.drawable.animr019_grey_03
            , R.drawable.animr019_grey_04
            , R.drawable.animr019_grey_05
            , R.drawable.animr019_grey_06
            , R.drawable.animr019_grey_07
            , R.drawable.animr019_grey_08
            , R.drawable.animr019_grey_09
            , R.drawable.animr019_grey_10
    }, {
            R.drawable.animr020_grey_01
            , R.drawable.animr020_grey_02
            , R.drawable.animr020_grey_03
            , R.drawable.animr020_grey_04
            , R.drawable.animr020_grey_05
            , R.drawable.animr020_grey_06
            , R.drawable.animr020_grey_07
            , R.drawable.animr020_grey_08
            , R.drawable.animr020_grey_09
            , R.drawable.animr020_grey_10
    }, {
            R.drawable.animr021_grey_01
            , R.drawable.animr021_grey_02
            , R.drawable.animr021_grey_03
            , R.drawable.animr021_grey_04
            , R.drawable.animr021_grey_05
            , R.drawable.animr021_grey_06
            , R.drawable.animr021_grey_07
            , R.drawable.animr021_grey_08
            , R.drawable.animr021_grey_09
            , R.drawable.animr021_grey_10
    }, {
            R.drawable.animr022_grey_01
            , R.drawable.animr022_grey_02
            , R.drawable.animr022_grey_03
            , R.drawable.animr022_grey_04
            , R.drawable.animr022_grey_05
            , R.drawable.animr022_grey_06
            , R.drawable.animr022_grey_07
            , R.drawable.animr022_grey_08
            , R.drawable.animr022_grey_09
            , R.drawable.animr022_grey_10
    }, {
            R.drawable.animr023_grey_01
            , R.drawable.animr023_grey_02
            , R.drawable.animr023_grey_03
            , R.drawable.animr023_grey_04
            , R.drawable.animr023_grey_05
            , R.drawable.animr023_grey_06
            , R.drawable.animr023_grey_07
            , R.drawable.animr023_grey_08
            , R.drawable.animr023_grey_09
            , R.drawable.animr023_grey_10
    }, {
            R.drawable.animr024_grey_01
            , R.drawable.animr024_grey_02
            , R.drawable.animr024_grey_03
            , R.drawable.animr024_grey_04
            , R.drawable.animr024_grey_05
            , R.drawable.animr024_grey_06
            , R.drawable.animr024_grey_07
            , R.drawable.animr024_grey_08
            , R.drawable.animr024_grey_09
            , R.drawable.animr024_grey_10
    }, {
            R.drawable.animr025_grey_01
            , R.drawable.animr025_grey_02
            , R.drawable.animr025_grey_03
            , R.drawable.animr025_grey_04
            , R.drawable.animr025_grey_05
            , R.drawable.animr025_grey_06
            , R.drawable.animr025_grey_07
            , R.drawable.animr025_grey_08
            , R.drawable.animr025_grey_09
            , R.drawable.animr025_grey_10
    }, {
            R.drawable.animr026_grey_01
            , R.drawable.animr026_grey_02
            , R.drawable.animr026_grey_03
            , R.drawable.animr026_grey_04
            , R.drawable.animr026_grey_05
            , R.drawable.animr026_grey_06
            , R.drawable.animr026_grey_07
            , R.drawable.animr026_grey_08
            , R.drawable.animr026_grey_09
            , R.drawable.animr026_grey_10
    }, {
            R.drawable.animr027_grey_01
            , R.drawable.animr027_grey_02
            , R.drawable.animr027_grey_03
            , R.drawable.animr027_grey_04
            , R.drawable.animr027_grey_05
            , R.drawable.animr027_grey_06
            , R.drawable.animr027_grey_07
            , R.drawable.animr027_grey_08
            , R.drawable.animr027_grey_09
            , R.drawable.animr027_grey_10
    }, {
            R.drawable.animr028_grey_01
            , R.drawable.animr028_grey_02
            , R.drawable.animr028_grey_03
            , R.drawable.animr028_grey_04
            , R.drawable.animr028_grey_05
            , R.drawable.animr028_grey_06
            , R.drawable.animr028_grey_07
            , R.drawable.animr028_grey_08
            , R.drawable.animr028_grey_09
            , R.drawable.animr028_grey_10
    }, {
            R.drawable.animr029_grey_01
            , R.drawable.animr029_grey_02
            , R.drawable.animr029_grey_03
            , R.drawable.animr029_grey_04
            , R.drawable.animr029_grey_05
            , R.drawable.animr029_grey_06
            , R.drawable.animr029_grey_07
            , R.drawable.animr029_grey_08
            , R.drawable.animr029_grey_09
            , R.drawable.animr029_grey_10
    }, {
            R.drawable.animr030_grey_01
            , R.drawable.animr030_grey_02
            , R.drawable.animr030_grey_03
            , R.drawable.animr030_grey_04
            , R.drawable.animr030_grey_05
            , R.drawable.animr030_grey_06
            , R.drawable.animr030_grey_07
            , R.drawable.animr030_grey_08
            , R.drawable.animr030_grey_09
            , R.drawable.animr030_grey_10
    }, {
            R.drawable.animr031_grey_01
            , R.drawable.animr031_grey_02
            , R.drawable.animr031_grey_03
            , R.drawable.animr031_grey_04
            , R.drawable.animr031_grey_05
            , R.drawable.animr031_grey_06
            , R.drawable.animr031_grey_07
            , R.drawable.animr031_grey_08
            , R.drawable.animr031_grey_09
            , R.drawable.animr031_grey_10
    }, {
            R.drawable.animr032_grey_01
            , R.drawable.animr032_grey_02
            , R.drawable.animr032_grey_03
            , R.drawable.animr032_grey_04
            , R.drawable.animr032_grey_05
            , R.drawable.animr032_grey_06
            , R.drawable.animr032_grey_07
            , R.drawable.animr032_grey_08
            , R.drawable.animr032_grey_09
            , R.drawable.animr032_grey_10
    }, {
            R.drawable.animr033_grey_01
            , R.drawable.animr033_grey_02
            , R.drawable.animr033_grey_03
            , R.drawable.animr033_grey_04
            , R.drawable.animr033_grey_05
            , R.drawable.animr033_grey_06
            , R.drawable.animr033_grey_07
            , R.drawable.animr033_grey_08
            , R.drawable.animr033_grey_09
            , R.drawable.animr033_grey_10
    }, {
            R.drawable.animr034_grey_01
            , R.drawable.animr034_grey_02
            , R.drawable.animr034_grey_03
            , R.drawable.animr034_grey_04
            , R.drawable.animr034_grey_05
            , R.drawable.animr034_grey_06
            , R.drawable.animr034_grey_07
            , R.drawable.animr034_grey_08
            , R.drawable.animr034_grey_09
            , R.drawable.animr034_grey_10
    }, {
            R.drawable.animr035a_grey_01
            , R.drawable.animr035a_grey_02
            , R.drawable.animr035a_grey_03
            , R.drawable.animr035a_grey_04
            , R.drawable.animr035a_grey_05
            , R.drawable.animr035a_grey_06
            , R.drawable.animr035a_grey_07
            , R.drawable.animr035a_grey_08
            , R.drawable.animr035a_grey_09
            , R.drawable.animr035a_grey_10
    }, {
            R.drawable.animr036_grey_01
            , R.drawable.animr036_grey_02
            , R.drawable.animr036_grey_03
            , R.drawable.animr036_grey_04
            , R.drawable.animr036_grey_05
            , R.drawable.animr036_grey_06
            , R.drawable.animr036_grey_07
            , R.drawable.animr036_grey_08
            , R.drawable.animr036_grey_09
            , R.drawable.animr036_grey_10
    }, {
            R.drawable.animr037_grey_01
            , R.drawable.animr037_grey_02
            , R.drawable.animr037_grey_03
            , R.drawable.animr037_grey_04
            , R.drawable.animr037_grey_05
            , R.drawable.animr037_grey_06
            , R.drawable.animr037_grey_07
            , R.drawable.animr037_grey_08
            , R.drawable.animr037_grey_09
            , R.drawable.animr037_grey_10
    }, {
            R.drawable.animr038_grey_01
            , R.drawable.animr038_grey_02
            , R.drawable.animr038_grey_03
            , R.drawable.animr038_grey_04
            , R.drawable.animr038_grey_05
            , R.drawable.animr038_grey_06
            , R.drawable.animr038_grey_07
            , R.drawable.animr038_grey_08
            , R.drawable.animr038_grey_09
            , R.drawable.animr038_grey_10
    }, {
            R.drawable.animr039_grey_01
            , R.drawable.animr039_grey_02
            , R.drawable.animr039_grey_03
            , R.drawable.animr039_grey_04
            , R.drawable.animr039_grey_05
            , R.drawable.animr039_grey_06
            , R.drawable.animr039_grey_07
            , R.drawable.animr039_grey_08
            , R.drawable.animr039_grey_09
            , R.drawable.animr039_grey_10
    }, {
            R.drawable.animr040_grey_01
            , R.drawable.animr040_grey_02
            , R.drawable.animr040_grey_03
            , R.drawable.animr040_grey_04
            , R.drawable.animr040_grey_05
            , R.drawable.animr040_grey_06
            , R.drawable.animr040_grey_07
            , R.drawable.animr040_grey_08
            , R.drawable.animr040_grey_09
            , R.drawable.animr040_grey_10
    }, {
            R.drawable.animr041_grey_01
            , R.drawable.animr041_grey_02
            , R.drawable.animr041_grey_03
            , R.drawable.animr041_grey_04
            , R.drawable.animr041_grey_05
            , R.drawable.animr041_grey_06
            , R.drawable.animr041_grey_07
            , R.drawable.animr041_grey_08
            , R.drawable.animr041_grey_09
            , R.drawable.animr041_grey_10
    }, {
            R.drawable.animr042_grey_01
            , R.drawable.animr042_grey_02
            , R.drawable.animr042_grey_03
            , R.drawable.animr042_grey_04
            , R.drawable.animr042_grey_05
            , R.drawable.animr042_grey_06
            , R.drawable.animr042_grey_07
            , R.drawable.animr042_grey_08
            , R.drawable.animr042_grey_09
            , R.drawable.animr042_grey_10
    }, {
            R.drawable.animr043_grey_01
            , R.drawable.animr043_grey_02
            , R.drawable.animr043_grey_03
            , R.drawable.animr043_grey_04
            , R.drawable.animr043_grey_05
            , R.drawable.animr043_grey_06
            , R.drawable.animr043_grey_07
            , R.drawable.animr043_grey_08
            , R.drawable.animr043_grey_09
            , R.drawable.animr043_grey_10
    }, {
            R.drawable.animr044_grey_01
            , R.drawable.animr044_grey_02
            , R.drawable.animr044_grey_03
            , R.drawable.animr044_grey_04
            , R.drawable.animr044_grey_05
            , R.drawable.animr044_grey_06
            , R.drawable.animr044_grey_07
            , R.drawable.animr044_grey_08
            , R.drawable.animr044_grey_09
            , R.drawable.animr044_grey_10
    }, {
            R.drawable.animr045_grey_01
            , R.drawable.animr045_grey_02
            , R.drawable.animr045_grey_03
            , R.drawable.animr045_grey_04
            , R.drawable.animr045_grey_05
            , R.drawable.animr045_grey_06
            , R.drawable.animr045_grey_07
            , R.drawable.animr045_grey_08
            , R.drawable.animr045_grey_09
            , R.drawable.animr045_grey_10
    }, {
            R.drawable.animr046_grey_01
            , R.drawable.animr046_grey_02
            , R.drawable.animr046_grey_03
            , R.drawable.animr046_grey_04
            , R.drawable.animr046_grey_05
            , R.drawable.animr046_grey_06
            , R.drawable.animr046_grey_07
            , R.drawable.animr046_grey_08
            , R.drawable.animr046_grey_09
            , R.drawable.animr046_grey_10
    }, {
            R.drawable.animr047_grey_01
            , R.drawable.animr047_grey_02
            , R.drawable.animr047_grey_03
            , R.drawable.animr047_grey_04
            , R.drawable.animr047_grey_05
            , R.drawable.animr047_grey_06
            , R.drawable.animr047_grey_07
            , R.drawable.animr047_grey_08
            , R.drawable.animr047_grey_09
            , R.drawable.animr047_grey_10
    }, {
            R.drawable.animr048_grey_01
            , R.drawable.animr048_grey_02
            , R.drawable.animr048_grey_03
            , R.drawable.animr048_grey_04
            , R.drawable.animr048_grey_05
            , R.drawable.animr048_grey_06
            , R.drawable.animr048_grey_07
            , R.drawable.animr048_grey_08
            , R.drawable.animr048_grey_09
            , R.drawable.animr048_grey_10
    }, {
            R.drawable.animr049_grey_01
            , R.drawable.animr049_grey_02
            , R.drawable.animr049_grey_03
            , R.drawable.animr049_grey_04
            , R.drawable.animr049_grey_05
            , R.drawable.animr049_grey_06
            , R.drawable.animr049_grey_07
            , R.drawable.animr049_grey_08
            , R.drawable.animr049_grey_09
            , R.drawable.animr049_grey_10
    }, {
            R.drawable.animr050_grey_01
            , R.drawable.animr050_grey_02
            , R.drawable.animr050_grey_03
            , R.drawable.animr050_grey_04
            , R.drawable.animr050_grey_05
            , R.drawable.animr050_grey_06
            , R.drawable.animr050_grey_07
            , R.drawable.animr050_grey_08
            , R.drawable.animr050_grey_09
            , R.drawable.animr050_grey_10
    }, {
            R.drawable.animr051_grey_01
            , R.drawable.animr051_grey_02
            , R.drawable.animr051_grey_03
            , R.drawable.animr051_grey_04
            , R.drawable.animr051_grey_05
            , R.drawable.animr051_grey_06
            , R.drawable.animr051_grey_07
            , R.drawable.animr051_grey_08
            , R.drawable.animr051_grey_09
            , R.drawable.animr051_grey_10
    }, {
            R.drawable.animr052_grey_01
            , R.drawable.animr052_grey_02
            , R.drawable.animr052_grey_03
            , R.drawable.animr052_grey_04
            , R.drawable.animr052_grey_05
            , R.drawable.animr052_grey_06
            , R.drawable.animr052_grey_07
            , R.drawable.animr052_grey_08
            , R.drawable.animr052_grey_09
            , R.drawable.animr052_grey_10
    }, {
            R.drawable.animr053_grey_01
            , R.drawable.animr053_grey_02
            , R.drawable.animr053_grey_03
            , R.drawable.animr053_grey_04
            , R.drawable.animr053_grey_05
            , R.drawable.animr053_grey_06
            , R.drawable.animr053_grey_07
            , R.drawable.animr053_grey_08
            , R.drawable.animr053_grey_09
            , R.drawable.animr053_grey_10
    }, {
            R.drawable.animr054_grey_01
            , R.drawable.animr054_grey_02
            , R.drawable.animr054_grey_03
            , R.drawable.animr054_grey_04
            , R.drawable.animr054_grey_05
            , R.drawable.animr054_grey_06
            , R.drawable.animr054_grey_07
            , R.drawable.animr054_grey_08
            , R.drawable.animr054_grey_09
            , R.drawable.animr054_grey_10
    }, {
            R.drawable.animr055_grey_01
            , R.drawable.animr055_grey_02
            , R.drawable.animr055_grey_03
            , R.drawable.animr055_grey_04
            , R.drawable.animr055_grey_05
            , R.drawable.animr055_grey_06
            , R.drawable.animr055_grey_07
            , R.drawable.animr055_grey_08
            , R.drawable.animr055_grey_09
            , R.drawable.animr055_grey_10
    }, {
            R.drawable.animr056_grey_01
            , R.drawable.animr056_grey_02
            , R.drawable.animr056_grey_03
            , R.drawable.animr056_grey_04
            , R.drawable.animr056_grey_05
            , R.drawable.animr056_grey_06
            , R.drawable.animr056_grey_07
            , R.drawable.animr056_grey_08
            , R.drawable.animr056_grey_09
            , R.drawable.animr056_grey_10
    }, {
            R.drawable.animr057_grey_01
            , R.drawable.animr057_grey_02
            , R.drawable.animr057_grey_03
            , R.drawable.animr057_grey_04
            , R.drawable.animr057_grey_05
            , R.drawable.animr057_grey_06
            , R.drawable.animr057_grey_07
            , R.drawable.animr057_grey_08
            , R.drawable.animr057_grey_09
            , R.drawable.animr057_grey_10
    }, {
            R.drawable.animr058_grey_01
            , R.drawable.animr058_grey_02
            , R.drawable.animr058_grey_03
            , R.drawable.animr058_grey_04
            , R.drawable.animr058_grey_05
            , R.drawable.animr058_grey_06
            , R.drawable.animr058_grey_07
            , R.drawable.animr058_grey_08
            , R.drawable.animr058_grey_09
            , R.drawable.animr058_grey_10
    }};

    private int[][] reds = {
            {
                    R.drawable.fr_my_home_kitchen_01_cravate_red
                    , R.drawable.fr_my_home_kitchen_01_lepingle_red
                    , R.drawable.fr_my_home_kitchen_01_chausse_pied_red
                    , R.drawable.fr_my_home_kitchen_01_bijou_red
                    , R.drawable.fr_my_home_kitchen_01_maquillage_red
                    , R.drawable.fr_my_home_kitchen_01_fouet_red
                    , R.drawable.fr_my_home_kitchen_01_cocotte_minute_red
                    , R.drawable.fr_my_home_kitchen_01_lepluche_legumes_red
                    , R.drawable.fr_my_home_kitchen_01_lecumoire_red
                    , R.drawable.fr_my_home_kitchen_01_passoire_red
            }, {
            R.drawable.fr_my_home_kitchen_02_leau_red
            , R.drawable.fr_my_home_kitchen_02_lait_red
            , R.drawable.fr_my_home_kitchen_02_huile_red
            , R.drawable.fr_my_home_kitchen_02_vinaigre_red
            , R.drawable.fr_my_home_kitchen_02_sucre_red
            , R.drawable.fr_my_home_kitchen_02_farine_red
            , R.drawable.fr_my_home_kitchen_02_sel_red
            , R.drawable.fr_my_home_kitchen_02_poivre_red
            , R.drawable.fr_my_home_kitchen_02_beurre_red
            , R.drawable.fr_my_home_kitchen_02_moutarde_red
    }, {
            R.drawable.fr_my_home_kitchen_03_lorange_red
            , R.drawable.fr_my_home_kitchen_03_pomme_red
            , R.drawable.fr_my_home_kitchen_03_fraise_red
            , R.drawable.fr_my_home_kitchen_03_banane_red
            , R.drawable.fr_my_home_kitchen_03_poire_red
            , R.drawable.fr_my_home_kitchen_03_chou_red
            , R.drawable.fr_my_home_kitchen_03_poireau_red
            , R.drawable.fr_my_home_kitchen_03_pomme_de_terre_red
            , R.drawable.fr_my_home_kitchen_03_carotte_red
            , R.drawable.fr_my_home_kitchen_03_concombre_red
    }, {
            R.drawable.fr_my_home_kitchen_04_plat_red
            , R.drawable.fr_my_home_kitchen_04_cuillere_red
            , R.drawable.fr_my_home_kitchen_04_verre_red
            , R.drawable.fr_my_home_kitchen_04_fourchette_red
            , R.drawable.fr_my_home_kitchen_04_bol_red
            , R.drawable.fr_my_home_kitchen_04_serviette_red
            , R.drawable.fr_my_home_kitchen_04_couteau_red
            , R.drawable.fr_my_home_kitchen_04_tasse_red
            , R.drawable.fr_my_home_kitchen_04_lassiette_red
            , R.drawable.fr_my_home_kitchen_04_marteau_red
    }, {
            R.drawable.animr05_red_01
            , R.drawable.animr05_red_02
            , R.drawable.animr05_red_03
            , R.drawable.animr05_red_04
            , R.drawable.animr05_red_05
            , R.drawable.animr05_red_06
            , R.drawable.animr05_red_07
            , R.drawable.animr05_red_08
            , R.drawable.animr05_red_09
            , R.drawable.animr05_red_10
    }, {
            R.drawable.animr06_red_01
            , R.drawable.animr06_red_02
            , R.drawable.animr06_red_03
            , R.drawable.animr06_red_04
            , R.drawable.animr06_red_05
            , R.drawable.animr06_red_06
            , R.drawable.animr06_red_07
            , R.drawable.animr06_red_08
            , R.drawable.animr06_red_09
            , R.drawable.animr06_red_10
    }, {
            R.drawable.animr07_red_01
            , R.drawable.animr07_red_02
            , R.drawable.animr07_red_03
            , R.drawable.animr07_red_04
            , R.drawable.animr07_red_05
            , R.drawable.animr07_red_06
            , R.drawable.animr07_red_07
            , R.drawable.animr07_red_08
            , R.drawable.animr07_red_09
            , R.drawable.animr07_red_10
    }, {
            R.drawable.animr08_red_01
            , R.drawable.animr08_red_02
            , R.drawable.animr08_red_03
            , R.drawable.animr08_red_04
            , R.drawable.animr08_red_05
            , R.drawable.animr08_red_06
            , R.drawable.animr08_red_07
            , R.drawable.animr08_red_08
            , R.drawable.animr08_red_09
            , R.drawable.animr08_red_10
    }, {
            R.drawable.fr_q03_my_home_bedroom_01_posa_red
            , R.drawable.fr_q03_my_home_bedroom_01_posb_red
            , R.drawable.fr_q03_my_home_bedroom_01_posc_red
            , R.drawable.fr_q03_my_home_bedroom_01_posd_red
            , R.drawable.fr_q03_my_home_bedroom_01_pose_red
            , R.drawable.fr_q03_my_home_bedroom_01_posf_red
            , R.drawable.fr_q03_my_home_bedroom_01_posg_red
            , R.drawable.fr_q03_my_home_bedroom_01_posh_red
            , R.drawable.fr_q03_my_home_bedroom_01_posi_red
            , R.drawable.fr_q03_my_home_bedroom_01_posj_red
    }, {
            R.drawable.fr_q03_my_home_bedroom_02_posa_red
            , R.drawable.fr_q03_my_home_bedroom_02_posb_red
            , R.drawable.fr_q03_my_home_bedroom_02_posc_red
            , R.drawable.fr_q03_my_home_bedroom_02_posd_red
            , R.drawable.fr_q03_my_home_bedroom_02_pose_red
            , R.drawable.fr_q03_my_home_bedroom_02_posf_red
            , R.drawable.fr_q03_my_home_bedroom_02_posg_red
            , R.drawable.fr_q03_my_home_bedroom_02_posh_red
            , R.drawable.fr_q03_my_home_bedroom_02_posi_red
            , R.drawable.fr_q03_my_home_bedroom_02_posj_red
    }, {
            R.drawable.fr_q03_my_home_bedroom_03_posa_red
            , R.drawable.fr_q03_my_home_bedroom_03_posb_red
            , R.drawable.fr_q03_my_home_bedroom_03_posc_red
            , R.drawable.fr_q03_my_home_bedroom_03_posd_red
            , R.drawable.fr_q03_my_home_bedroom_03_pose_red
            , R.drawable.fr_q03_my_home_bedroom_03_posf_red
            , R.drawable.fr_q03_my_home_bedroom_03_posg_red
            , R.drawable.fr_q03_my_home_bedroom_03_posh_red
            , R.drawable.fr_q03_my_home_bedroom_03_posi_red
            , R.drawable.fr_q03_my_home_bedroom_03_posj_red
    }, {
            R.drawable.fr_q03_my_home_bedroom_04_posa_red
            , R.drawable.fr_q03_my_home_bedroom_04_posb_red
            , R.drawable.fr_q03_my_home_bedroom_04_posc_red
            , R.drawable.fr_q03_my_home_bedroom_04_posd_red
            , R.drawable.fr_q03_my_home_bedroom_04_pose_red
            , R.drawable.fr_q03_my_home_bedroom_04_posf_red
            , R.drawable.fr_q03_my_home_bedroom_04_posg_red
            , R.drawable.fr_q03_my_home_bedroom_04_posh_red
            , R.drawable.fr_q03_my_home_bedroom_04_posi_red
            , R.drawable.fr_q03_my_home_bedroom_04_posj_red
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_red
            , R.drawable.fr_q04_my_home_garden_01_posb_red
            , R.drawable.fr_q04_my_home_garden_01_posc_red
            , R.drawable.fr_q04_my_home_garden_01_posd_red
            , R.drawable.fr_q04_my_home_garden_01_pose_red
            , R.drawable.fr_q04_my_home_garden_01_posf_red
            , R.drawable.fr_q04_my_home_garden_01_posg_red
            , R.drawable.fr_q04_my_home_garden_01_posh_red
            , R.drawable.fr_q04_my_home_garden_01_posi_red
            , R.drawable.fr_q04_my_home_garden_01_posj_red
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_red
            , R.drawable.fr_q04_my_home_garden_01_posb_red
            , R.drawable.fr_q04_my_home_garden_01_posc_red
            , R.drawable.fr_q04_my_home_garden_01_posd_red
            , R.drawable.fr_q04_my_home_garden_01_pose_red
            , R.drawable.fr_q04_my_home_garden_01_posf_red
            , R.drawable.fr_q04_my_home_garden_01_posg_red
            , R.drawable.fr_q04_my_home_garden_01_posh_red
            , R.drawable.fr_q04_my_home_garden_01_posi_red
            , R.drawable.fr_q04_my_home_garden_01_posj_red
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_red
            , R.drawable.fr_q04_my_home_garden_01_posb_red
            , R.drawable.fr_q04_my_home_garden_01_posc_red
            , R.drawable.fr_q04_my_home_garden_01_posd_red
            , R.drawable.fr_q04_my_home_garden_01_pose_red
            , R.drawable.fr_q04_my_home_garden_01_posf_red
            , R.drawable.fr_q04_my_home_garden_01_posg_red
            , R.drawable.fr_q04_my_home_garden_01_posh_red
            , R.drawable.fr_q04_my_home_garden_01_posi_red
            , R.drawable.fr_q04_my_home_garden_01_posj_red
    }, {
            R.drawable.fr_q04_my_home_garden_01_posa_red
            , R.drawable.fr_q04_my_home_garden_01_posb_red
            , R.drawable.fr_q04_my_home_garden_01_posc_red
            , R.drawable.fr_q04_my_home_garden_01_posd_red
            , R.drawable.fr_q04_my_home_garden_01_pose_red
            , R.drawable.fr_q04_my_home_garden_01_posf_red
            , R.drawable.fr_q04_my_home_garden_01_posg_red
            , R.drawable.fr_q04_my_home_garden_01_posh_red
            , R.drawable.fr_q04_my_home_garden_01_posi_red
            , R.drawable.fr_q04_my_home_garden_01_posj_red
    }, {
            R.drawable.animr017_red_01
            , R.drawable.animr017_red_02
            , R.drawable.animr017_red_03
            , R.drawable.animr017_red_04
            , R.drawable.animr017_red_05
            , R.drawable.animr017_red_06
            , R.drawable.animr017_red_07
            , R.drawable.animr017_red_08
            , R.drawable.animr017_red_09
            , R.drawable.animr017_red_10
    }, {
            R.drawable.animr018_red_01
            , R.drawable.animr018_red_02
            , R.drawable.animr018_red_03
            , R.drawable.animr018_red_04
            , R.drawable.animr018_red_05
            , R.drawable.animr018_red_06
            , R.drawable.animr018_red_07
            , R.drawable.animr018_red_08
            , R.drawable.animr018_red_09
            , R.drawable.animr018_red_10
    }, {
            R.drawable.animr019_red_01
            , R.drawable.animr019_red_02
            , R.drawable.animr019_red_03
            , R.drawable.animr019_red_04
            , R.drawable.animr019_red_05
            , R.drawable.animr019_red_06
            , R.drawable.animr019_red_07
            , R.drawable.animr019_red_08
            , R.drawable.animr019_red_09
            , R.drawable.animr019_red_10
    }, {
            R.drawable.animr020_red_01
            , R.drawable.animr020_red_02
            , R.drawable.animr020_red_03
            , R.drawable.animr020_red_04
            , R.drawable.animr020_red_05
            , R.drawable.animr020_red_06
            , R.drawable.animr020_red_07
            , R.drawable.animr020_red_08
            , R.drawable.animr020_red_09
            , R.drawable.animr020_red_10
    }, {
            R.drawable.animr021_red_01
            , R.drawable.animr021_red_02
            , R.drawable.animr021_red_03
            , R.drawable.animr021_red_04
            , R.drawable.animr021_red_05
            , R.drawable.animr021_red_06
            , R.drawable.animr021_red_07
            , R.drawable.animr021_red_08
            , R.drawable.animr021_red_09
            , R.drawable.animr021_red_10
    }, {
            R.drawable.animr022_red_01
            , R.drawable.animr022_red_02
            , R.drawable.animr022_red_03
            , R.drawable.animr022_red_04
            , R.drawable.animr022_red_05
            , R.drawable.animr022_red_06
            , R.drawable.animr022_red_07
            , R.drawable.animr022_red_08
            , R.drawable.animr022_red_09
            , R.drawable.animr022_red_10
    }, {
            R.drawable.animr023_red_01
            , R.drawable.animr023_red_02
            , R.drawable.animr023_red_03
            , R.drawable.animr023_red_04
            , R.drawable.animr023_red_05
            , R.drawable.animr023_red_06
            , R.drawable.animr023_red_07
            , R.drawable.animr023_red_08
            , R.drawable.animr023_red_09
            , R.drawable.animr023_red_10
    }, {
            R.drawable.animr024_red_01
            , R.drawable.animr024_red_02
            , R.drawable.animr024_red_03
            , R.drawable.animr024_red_04
            , R.drawable.animr024_red_05
            , R.drawable.animr024_red_06
            , R.drawable.animr024_red_07
            , R.drawable.animr024_red_08
            , R.drawable.animr024_red_09
            , R.drawable.animr024_red_10
    }, {
            R.drawable.animr025_red_01
            , R.drawable.animr025_red_02
            , R.drawable.animr025_red_03
            , R.drawable.animr025_red_04
            , R.drawable.animr025_red_05
            , R.drawable.animr025_red_06
            , R.drawable.animr025_red_07
            , R.drawable.animr025_red_08
            , R.drawable.animr025_red_09
            , R.drawable.animr025_red_10
    }, {
            R.drawable.animr026_red_01
            , R.drawable.animr026_red_02
            , R.drawable.animr026_red_03
            , R.drawable.animr026_red_04
            , R.drawable.animr026_red_05
            , R.drawable.animr026_red_06
            , R.drawable.animr026_red_07
            , R.drawable.animr026_red_08
            , R.drawable.animr026_red_09
            , R.drawable.animr026_red_10
    }, {
            R.drawable.animr027_red_01
            , R.drawable.animr027_red_02
            , R.drawable.animr027_red_03
            , R.drawable.animr027_red_04
            , R.drawable.animr027_red_05
            , R.drawable.animr027_red_06
            , R.drawable.animr027_red_07
            , R.drawable.animr027_red_08
            , R.drawable.animr027_red_09
            , R.drawable.animr027_red_10
    }, {
            R.drawable.animr028_red_01
            , R.drawable.animr028_red_02
            , R.drawable.animr028_red_03
            , R.drawable.animr028_red_04
            , R.drawable.animr028_red_05
            , R.drawable.animr028_red_06
            , R.drawable.animr028_red_07
            , R.drawable.animr028_red_08
            , R.drawable.animr028_red_09
            , R.drawable.animr028_red_10
    }, {
            R.drawable.animr029_red_01
            , R.drawable.animr029_red_02
            , R.drawable.animr029_red_03
            , R.drawable.animr029_red_04
            , R.drawable.animr029_red_05
            , R.drawable.animr029_red_06
            , R.drawable.animr029_red_07
            , R.drawable.animr029_red_08
            , R.drawable.animr029_red_09
            , R.drawable.animr029_red_10
    }, {
            R.drawable.animr030_red_01
            , R.drawable.animr030_red_02
            , R.drawable.animr030_red_03
            , R.drawable.animr030_red_04
            , R.drawable.animr030_red_05
            , R.drawable.animr030_red_06
            , R.drawable.animr030_red_07
            , R.drawable.animr030_red_08
            , R.drawable.animr030_red_09
            , R.drawable.animr030_red_10
    }, {
            R.drawable.animr031_red_01
            , R.drawable.animr031_red_02
            , R.drawable.animr031_red_03
            , R.drawable.animr031_red_04
            , R.drawable.animr031_red_05
            , R.drawable.animr031_red_06
            , R.drawable.animr031_red_07
            , R.drawable.animr031_red_08
            , R.drawable.animr031_red_09
            , R.drawable.animr031_red_10
    }, {
            R.drawable.animr032_red_01
            , R.drawable.animr032_red_02
            , R.drawable.animr032_red_03
            , R.drawable.animr032_red_04
            , R.drawable.animr032_red_05
            , R.drawable.animr032_red_06
            , R.drawable.animr032_red_07
            , R.drawable.animr032_red_08
            , R.drawable.animr032_red_09
            , R.drawable.animr032_red_10
    }, {
            R.drawable.animr033_red_01
            , R.drawable.animr033_red_02
            , R.drawable.animr033_red_03
            , R.drawable.animr033_red_04
            , R.drawable.animr033_red_05
            , R.drawable.animr033_red_06
            , R.drawable.animr033_red_07
            , R.drawable.animr033_red_08
            , R.drawable.animr033_red_09
            , R.drawable.animr033_red_10
    }, {
            R.drawable.animr034_red_01
            , R.drawable.animr034_red_02
            , R.drawable.animr034_red_03
            , R.drawable.animr034_red_04
            , R.drawable.animr034_red_05
            , R.drawable.animr034_red_06
            , R.drawable.animr034_red_07
            , R.drawable.animr034_red_08
            , R.drawable.animr034_red_09
            , R.drawable.animr034_red_10
    }, {
            R.drawable.animr035a_red_01
            , R.drawable.animr035a_red_02
            , R.drawable.animr035a_red_03
            , R.drawable.animr035a_red_04
            , R.drawable.animr035a_red_05
            , R.drawable.animr035a_red_06
            , R.drawable.animr035a_red_07
            , R.drawable.animr035a_red_08
            , R.drawable.animr035a_red_09
            , R.drawable.animr035a_red_10
    }, {
            R.drawable.animr036_red_01
            , R.drawable.animr036_red_02
            , R.drawable.animr036_red_03
            , R.drawable.animr036_red_04
            , R.drawable.animr036_red_05
            , R.drawable.animr036_red_06
            , R.drawable.animr036_red_07
            , R.drawable.animr036_red_08
            , R.drawable.animr036_red_09
            , R.drawable.animr036_red_10
    }, {
            R.drawable.animr037_red_01
            , R.drawable.animr037_red_02
            , R.drawable.animr037_red_03
            , R.drawable.animr037_red_04
            , R.drawable.animr037_red_05
            , R.drawable.animr037_red_06
            , R.drawable.animr037_red_07
            , R.drawable.animr037_red_08
            , R.drawable.animr037_red_09
            , R.drawable.animr037_red_10
    }, {
            R.drawable.animr038_red_01
            , R.drawable.animr038_red_02
            , R.drawable.animr038_red_03
            , R.drawable.animr038_red_04
            , R.drawable.animr038_red_05
            , R.drawable.animr038_red_06
            , R.drawable.animr038_red_07
            , R.drawable.animr038_red_08
            , R.drawable.animr038_red_09
            , R.drawable.animr038_red_10
    }, {
            R.drawable.animr039_red_01
            , R.drawable.animr039_red_02
            , R.drawable.animr039_red_03
            , R.drawable.animr039_red_04
            , R.drawable.animr039_red_05
            , R.drawable.animr039_red_06
            , R.drawable.animr039_red_07
            , R.drawable.animr039_red_08
            , R.drawable.animr039_red_09
            , R.drawable.animr039_red_10
    }, {
            R.drawable.animr040_red_01
            , R.drawable.animr040_red_02
            , R.drawable.animr040_red_03
            , R.drawable.animr040_red_04
            , R.drawable.animr040_red_05
            , R.drawable.animr040_red_06
            , R.drawable.animr040_red_07
            , R.drawable.animr040_red_08
            , R.drawable.animr040_red_09
            , R.drawable.animr040_red_10
    }, {
            R.drawable.animr041_red_01
            , R.drawable.animr041_red_02
            , R.drawable.animr041_red_03
            , R.drawable.animr041_red_04
            , R.drawable.animr041_red_05
            , R.drawable.animr041_red_06
            , R.drawable.animr041_red_07
            , R.drawable.animr041_red_08
            , R.drawable.animr041_red_09
            , R.drawable.animr041_red_10
    }, {
            R.drawable.animr042_red_01
            , R.drawable.animr042_red_02
            , R.drawable.animr042_red_03
            , R.drawable.animr042_red_04
            , R.drawable.animr042_red_05
            , R.drawable.animr042_red_06
            , R.drawable.animr042_red_07
            , R.drawable.animr042_red_08
            , R.drawable.animr042_red_09
            , R.drawable.animr042_red_10
    }, {
            R.drawable.animr043_red_01
            , R.drawable.animr043_red_02
            , R.drawable.animr043_red_03
            , R.drawable.animr043_red_04
            , R.drawable.animr043_red_05
            , R.drawable.animr043_red_06
            , R.drawable.animr043_red_07
            , R.drawable.animr043_red_08
            , R.drawable.animr043_red_09
            , R.drawable.animr043_red_10
    }, {
            R.drawable.animr044_red_01
            , R.drawable.animr044_red_02
            , R.drawable.animr044_red_03
            , R.drawable.animr044_red_04
            , R.drawable.animr044_red_05
            , R.drawable.animr044_red_06
            , R.drawable.animr044_red_07
            , R.drawable.animr044_red_08
            , R.drawable.animr044_red_09
            , R.drawable.animr044_red_10
    }, {
            R.drawable.animr045_red_01
            , R.drawable.animr045_red_02
            , R.drawable.animr045_red_03
            , R.drawable.animr045_red_04
            , R.drawable.animr045_red_05
            , R.drawable.animr045_red_06
            , R.drawable.animr045_red_07
            , R.drawable.animr045_red_08
            , R.drawable.animr045_red_09
            , R.drawable.animr045_red_10
    }, {
            R.drawable.animr046_red_01
            , R.drawable.animr046_red_02
            , R.drawable.animr046_red_03
            , R.drawable.animr046_red_04
            , R.drawable.animr046_red_05
            , R.drawable.animr046_red_06
            , R.drawable.animr046_red_07
            , R.drawable.animr046_red_08
            , R.drawable.animr046_red_09
            , R.drawable.animr046_red_10
    }, {
            R.drawable.animr047_red_01
            , R.drawable.animr047_red_02
            , R.drawable.animr047_red_03
            , R.drawable.animr047_red_04
            , R.drawable.animr047_red_05
            , R.drawable.animr047_red_06
            , R.drawable.animr047_red_07
            , R.drawable.animr047_red_08
            , R.drawable.animr047_red_09
            , R.drawable.animr047_red_10
    }, {
            R.drawable.animr048_red_01
            , R.drawable.animr048_red_02
            , R.drawable.animr048_red_03
            , R.drawable.animr048_red_04
            , R.drawable.animr048_red_05
            , R.drawable.animr048_red_06
            , R.drawable.animr048_red_07
            , R.drawable.animr048_red_08
            , R.drawable.animr048_red_09
            , R.drawable.animr048_red_10
    }, {
            R.drawable.animr049_red_01
            , R.drawable.animr049_red_02
            , R.drawable.animr049_red_03
            , R.drawable.animr049_red_04
            , R.drawable.animr049_red_05
            , R.drawable.animr049_red_06
            , R.drawable.animr049_red_07
            , R.drawable.animr049_red_08
            , R.drawable.animr049_red_09
            , R.drawable.animr049_red_10
    }, {
            R.drawable.animr050_red_01
            , R.drawable.animr050_red_02
            , R.drawable.animr050_red_03
            , R.drawable.animr050_red_04
            , R.drawable.animr050_red_05
            , R.drawable.animr050_red_06
            , R.drawable.animr050_red_07
            , R.drawable.animr050_red_08
            , R.drawable.animr050_red_09
            , R.drawable.animr050_red_10
    }, {
            R.drawable.animr051_red_01
            , R.drawable.animr051_red_02
            , R.drawable.animr051_red_03
            , R.drawable.animr051_red_04
            , R.drawable.animr051_red_05
            , R.drawable.animr051_red_06
            , R.drawable.animr051_red_07
            , R.drawable.animr051_red_08
            , R.drawable.animr051_red_09
            , R.drawable.animr051_red_10
    }, {
            R.drawable.animr052_red_01
            , R.drawable.animr052_red_02
            , R.drawable.animr052_red_03
            , R.drawable.animr052_red_04
            , R.drawable.animr052_red_05
            , R.drawable.animr052_red_06
            , R.drawable.animr052_red_07
            , R.drawable.animr052_red_08
            , R.drawable.animr052_red_09
            , R.drawable.animr052_red_10
    }, {
            R.drawable.animr053_red_01
            , R.drawable.animr053_red_02
            , R.drawable.animr053_red_03
            , R.drawable.animr053_red_04
            , R.drawable.animr053_red_05
            , R.drawable.animr053_red_06
            , R.drawable.animr053_red_07
            , R.drawable.animr053_red_08
            , R.drawable.animr053_red_09
            , R.drawable.animr053_red_10
    }, {
            R.drawable.animr054_red_01
            , R.drawable.animr054_red_02
            , R.drawable.animr054_red_03
            , R.drawable.animr054_red_04
            , R.drawable.animr054_red_05
            , R.drawable.animr054_red_06
            , R.drawable.animr054_red_07
            , R.drawable.animr054_red_08
            , R.drawable.animr054_red_09
            , R.drawable.animr054_red_10
    }, {
            R.drawable.animr055_red_01
            , R.drawable.animr055_red_02
            , R.drawable.animr055_red_03
            , R.drawable.animr055_red_04
            , R.drawable.animr055_red_05
            , R.drawable.animr055_red_06
            , R.drawable.animr055_red_07
            , R.drawable.animr055_red_08
            , R.drawable.animr055_red_09
            , R.drawable.animr055_red_10
    }, {
            R.drawable.animr056_red_01
            , R.drawable.animr056_red_02
            , R.drawable.animr056_red_03
            , R.drawable.animr056_red_04
            , R.drawable.animr056_red_05
            , R.drawable.animr056_red_06
            , R.drawable.animr056_red_07
            , R.drawable.animr056_red_08
            , R.drawable.animr056_red_09
            , R.drawable.animr056_red_10
    }, {
            R.drawable.animr057_red_01
            , R.drawable.animr057_red_02
            , R.drawable.animr057_red_03
            , R.drawable.animr057_red_04
            , R.drawable.animr057_red_05
            , R.drawable.animr057_red_06
            , R.drawable.animr057_red_07
            , R.drawable.animr057_red_08
            , R.drawable.animr057_red_09
            , R.drawable.animr057_red_10
    }, {
            R.drawable.animr058_red_01
            , R.drawable.animr058_red_02
            , R.drawable.animr058_red_03
            , R.drawable.animr058_red_04
            , R.drawable.animr058_red_05
            , R.drawable.animr058_red_06
            , R.drawable.animr058_red_07
            , R.drawable.animr058_red_08
            , R.drawable.animr058_red_09
            , R.drawable.animr058_red_10
    }};


}
