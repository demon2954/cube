package brind.cube.entity;

import brind.cube.enums.Color;
import lombok.Data;

/**
 * 角
 * 第1级(黄=黑)
 * 第2级(红=橙)
 * 第3级(绿=蓝)
 * 优先顺序 1>2>3
 * @author zone
 * @date 2017-12-08
 */
@Data
public class Horn {
	// 最优先的颜色块
	private Color colorTop;
	private Color colorLeft;
	private Color colorRight;
	private char positionCode;
}
