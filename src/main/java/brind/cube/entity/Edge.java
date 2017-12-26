package brind.cube.entity;

import brind.cube.enums.Color;
import lombok.Data;

/**
 * 棱
 * 第1级(黄=黑)
 * 第2级(红=橙)
 * 第3级(绿=蓝)
 * 优先顺序 1>2>3
 * @author zone
 * @date 2017-12-08
 */
@Data
public class Edge {
	// 优先的颜色块
	private Color colorTop;
	private Color colorDown;
	private char positionCode;
	
	public boolean needFlip() {
		if (colorTop.equals(Color.YELLOW) || colorTop.equals(Color.BLACK)) {
			return false;
		}
		if (colorTop.equals(Color.BLUE) || colorTop.equals(Color.GREEN)) {
			return true;
		}
		if (colorDown.equals(Color.YELLOW) || colorDown.equals(Color.BLACK)) {
			return true;
		}
		return false;
	}
}
