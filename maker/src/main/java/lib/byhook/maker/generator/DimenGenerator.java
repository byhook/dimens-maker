package lib.byhook.maker.generator;


import lib.byhook.maker.constants.DimenTypes;
import lib.byhook.maker.utils.MakeUtils;

/**
 * 作者: Andy
 * 时间: 2016-12-28
 * 描述:
 * 尺寸适配生成器
 */
public class DimenGenerator {

    /**
     * 设计稿尺寸
     */
    private static final int DESIGN_WIDTH = 750;

    /**
     * 设计稿高度
     */
    private static final int DESIGN_HEIGHT = 1334;

    public static void main(String[] args) {

        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            MakeUtils.makeAll(DESIGN_WIDTH, value, "/opt/adapter");
        }

    }

}
