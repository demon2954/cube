package brind.cube.enums;

/**
 * @author zone
 * @date 2017-12-08
 */
public enum Color {
	//黄1    黑2    红3    橙4    蓝5    绿6"
	RED(3), ORANGE(4), GREEN(6), BLUE(5), BLACK(2), YELLOW(1);

	private int code;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	private Color(int code) {
		this.code = code;
	}

	public static Color getEnum(int code) {
		for (Color one : values()) {
			if (one.getCode() == code)
				return one;
		}
		return null;
	}
}
