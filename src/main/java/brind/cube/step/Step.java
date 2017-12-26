package brind.cube.step;

/**
 * @author zone
 * @date 2017-12-15
 */
public class Step {
	// 棱-顺时针
	public static final String EDGE_ALONG = "R U' R U R U R U' R' U' R2 ";
	// 棱-逆时针
	public static final String EDGE_INVERSE = "L' U L' U' L' U' L' U L U L2 ";

	// 角-顺时针
	public static final String HORN_ALONG = "r' U L' D2 L U' L' D2 L2 y ";
	// 角-逆时针
	public static final String HORN_INVERSE = "l U' R D2 R' U R D2 R2 y ";
	// 角-上升
	public static final String HORN_UP = "(R' F R F')3 U2 (R' F R F')3 U2 ";
	// 角-下降
	public static final String HORN_DOWN = "U2 (R' F R F')3 U2 (R' F R F')3 ";

	// 翻四棱
	public static final String EDGE_FLIP_FOUR = "(M U)4 ";
	// 翻二棱
	public static final String EDGE_FLIP_TWO = "(M' U)4 ";

	// 翻二角，同左
	public static final String HORN_FLIP_SAME = "L' U2 L U L' U L R U2 R' U' R U' R' ";
	// 翻二角，相对
	public static final String HORN_FLIP_BACK = "R U R' U R U2 R' L' U' L U' L' U2 L ";
	// 翻三角，顺时针
	public static final String HORN_FLIP_ALONG = "(U R U' R')2 L' (U R U' R')2 L' (U R U' R')2 L2 ";
	// 翻三角，逆时针
	public static final String HORN_FLIP_INVERSE = "(R U R' U')2 L' (R U R' U')2 L' (R U R' U')2 L2 ";

	private static String SEQUENTIAL_STEP = "";

	public static void pushSequentialStep(String step) {
		SEQUENTIAL_STEP = step;
	}
	
	public static void popReverseStep(String step) {
		SEQUENTIAL_STEP = step;
	}
}
