package brind.cube;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import brind.cube.entity.Center;
import brind.cube.entity.CubeModel;
import brind.cube.entity.Edge;
import brind.cube.entity.Horn;
import brind.cube.enums.Color;

/**
 * @author zone
 * @date 2017-12-08
 */
public class Cube {
	private static String colorQueue;
	private static CubeModel cubeModel;
	private static StringBuffer stepBuffer = new StringBuffer();

	/**
	 * 获取各面颜色序列
	 * @return
	 */
	private static String inputColorQueue() {
//		StringBuffer str = new StringBuffer();
//		System.out.println("请输入顶面颜色序列，黄1    黑2    红3    橙4    蓝5    绿6");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str.append(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("请输入底面颜色序列，黄1    黑2    红3    橙4    蓝5    绿6");
//		br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str.append(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("请输入前面颜色序列，黄1    黑2    红3    橙4    蓝5    绿6");
//		br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str.append(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("请输入背面颜色序列，黄1    黑2    红3    橙4    蓝5    绿6");
//		br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str.append(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("请输入左面颜色序列，黄1    黑2    红3    橙4    蓝5    绿6");
//		br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str.append(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("请输入右面颜色序列，黄1    黑2    红3    橙4    蓝5    绿6");
//		br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			str.append(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		return str.toString();
		return "111111111222222222333333333444444444555555555666666666";
	}

	/**
	 * 拼装魔方颜色
	 */
	private static void inputColor() {
		cubeModel = new CubeModel();
		Horn horn1 = new Horn();
		horn1.setColorTop(Color.getEnum(getNum(6)));
		horn1.setColorLeft(Color.getEnum(getNum(38)));
		horn1.setColorRight(Color.getEnum(getNum(18)));
		horn1.setPositionCode('1');
		cubeModel.setHorn_1(horn1);

		Horn horn2 = new Horn();
		horn2.setColorTop(Color.getEnum(getNum(0)));
		horn2.setColorLeft(Color.getEnum(getNum(29)));
		horn2.setColorRight(Color.getEnum(getNum(36)));
		horn2.setPositionCode('2');
		cubeModel.setHorn_2(horn2);

		Horn horn3 = new Horn();
		horn3.setColorTop(Color.getEnum(getNum(2)));
		horn3.setColorLeft(Color.getEnum(getNum(47)));
		horn3.setColorRight(Color.getEnum(getNum(27)));
		horn3.setPositionCode('3');
		cubeModel.setHorn_3(horn3);

		Horn horn4 = new Horn();
		horn4.setColorTop(Color.getEnum(getNum(8)));
		horn4.setColorLeft(Color.getEnum(getNum(20)));
		horn4.setColorRight(Color.getEnum(getNum(45)));
		horn4.setPositionCode('4');
		cubeModel.setHorn_4(horn4);

		Horn horn5 = new Horn();
		horn5.setColorTop(Color.getEnum(getNum(9)));
		horn5.setColorLeft(Color.getEnum(getNum(24)));
		horn5.setColorRight(Color.getEnum(getNum(44)));
		horn5.setPositionCode('5');
		cubeModel.setHorn_5(horn5);

		Horn horn6 = new Horn();
		horn6.setColorTop(Color.getEnum(getNum(15)));
		horn6.setColorLeft(Color.getEnum(getNum(42)));
		horn6.setColorRight(Color.getEnum(getNum(35)));
		horn6.setPositionCode('6');
		cubeModel.setHorn_6(horn6);

		Horn horn7 = new Horn();
		horn7.setColorTop(Color.getEnum(getNum(17)));
		horn7.setColorLeft(Color.getEnum(getNum(33)));
		horn7.setColorRight(Color.getEnum(getNum(53)));
		horn7.setPositionCode('7');
		cubeModel.setHorn_7(horn7);

		Horn horn8 = new Horn();
		horn8.setColorTop(Color.getEnum(getNum(11)));
		horn8.setColorLeft(Color.getEnum(getNum(51)));
		horn8.setColorRight(Color.getEnum(getNum(26)));
		horn8.setPositionCode('8');
		cubeModel.setHorn_8(horn8);

		Edge edge_r = new Edge();
		edge_r.setColorTop(Color.getEnum(getNum(7)));
		edge_r.setColorDown(Color.getEnum(getNum(19)));
		edge_r.setPositionCode('r');
		cubeModel.setEdge_r(edge_r);

		Edge edge_2 = new Edge();
		edge_2.setColorTop(Color.getEnum(getNum(3)));
		edge_2.setColorDown(Color.getEnum(getNum(37)));
		edge_2.setPositionCode('2');
		cubeModel.setEdge_2(edge_2);

		Edge edge_3 = new Edge();
		edge_3.setColorTop(Color.getEnum(getNum(1)));
		edge_3.setColorDown(Color.getEnum(getNum(28)));
		edge_3.setPositionCode('3');
		cubeModel.setEdge_3(edge_3);

		Edge edge_4 = new Edge();
		edge_4.setColorTop(Color.getEnum(getNum(5)));
		edge_4.setColorDown(Color.getEnum(getNum(46)));
		edge_4.setPositionCode('4');
		cubeModel.setEdge_4(edge_4);

		Edge edge_5 = new Edge();
		edge_5.setColorTop(Color.getEnum(getNum(10)));
		edge_5.setColorDown(Color.getEnum(getNum(25)));
		edge_5.setPositionCode('5');
		cubeModel.setEdge_5(edge_5);

		Edge edge_6 = new Edge();
		edge_6.setColorTop(Color.getEnum(getNum(12)));
		edge_6.setColorDown(Color.getEnum(getNum(43)));
		edge_6.setPositionCode('6');
		cubeModel.setEdge_6(edge_6);

		Edge edge_7 = new Edge();
		edge_7.setColorTop(Color.getEnum(getNum(16)));
		edge_7.setColorDown(Color.getEnum(getNum(34)));
		edge_7.setPositionCode('7');
		cubeModel.setEdge_7(edge_7);

		Edge edge_8 = new Edge();
		edge_8.setColorTop(Color.getEnum(getNum(14)));
		edge_8.setColorDown(Color.getEnum(getNum(52)));
		edge_8.setPositionCode('8');
		cubeModel.setEdge_8(edge_8);

		Edge edge_9 = new Edge();
		edge_9.setColorTop(Color.getEnum(getNum(21)));
		edge_9.setColorDown(Color.getEnum(getNum(41)));
		edge_9.setPositionCode('9');
		cubeModel.setEdge_9(edge_9);

		Edge edge_0 = new Edge();
		edge_0.setColorTop(Color.getEnum(getNum(32)));
		edge_0.setColorDown(Color.getEnum(getNum(39)));
		edge_0.setPositionCode('0');
		cubeModel.setEdge_0(edge_0);

		Edge edge_1 = new Edge();
		edge_1.setColorTop(Color.getEnum(getNum(30)));
		edge_1.setColorDown(Color.getEnum(getNum(50)));
		edge_1.setPositionCode('1');
		cubeModel.setEdge_1(edge_1);

		Edge edge_a = new Edge();
		edge_a.setColorTop(Color.getEnum(getNum(23)));
		edge_a.setColorDown(Color.getEnum(getNum(48)));
		edge_a.setPositionCode('a');
		cubeModel.setEdge_a(edge_a);

		Center top = new Center();
		top.setColor(Color.getEnum(getNum(4)));
		cubeModel.setTop(top);

		Center down = new Center();
		down.setColor(Color.getEnum(getNum(13)));
		cubeModel.setDown(down);

		Center front = new Center();
		front.setColor(Color.getEnum(getNum(22)));
		cubeModel.setFront(front);

		Center back = new Center();
		back.setColor(Color.getEnum(getNum(31)));
		cubeModel.setBack(back);

		Center left = new Center();
		left.setColor(Color.getEnum(getNum(40)));
		cubeModel.setLeft(left);

		Center right = new Center();
		right.setColor(Color.getEnum(getNum(49)));
		cubeModel.setRight(right);
	}

	/**
	 * 建立坐标系
	 */
	private static void buildCoordinate() {
		if (cubeModel.getTop().getColor().equals(Color.YELLOW)) {
		} else if (cubeModel.getDown().getColor().equals(Color.YELLOW)) {
			stepBuffer.append("x2 ");
			cubeModel.x2();
		} else if (cubeModel.getFront().getColor().equals(Color.YELLOW)) {
			stepBuffer.append("y ");
			cubeModel.y();
		} else if (cubeModel.getBack().getColor().equals(Color.YELLOW)) {
			stepBuffer.append("y' ");
			cubeModel.yv();
		} else if (cubeModel.getLeft().getColor().equals(Color.YELLOW)) {
			stepBuffer.append("x ");
			cubeModel.x();
		} else if (cubeModel.getRight().getColor().equals(Color.YELLOW)) {
			stepBuffer.append("x' ");
			cubeModel.xv();
		}

		if (cubeModel.getFront().getColor().equals(Color.RED)) {
		} else if (cubeModel.getLeft().getColor().equals(Color.RED)) {
			stepBuffer.append("z' ");
			cubeModel.zv();
		} else if (cubeModel.getBack().getColor().equals(Color.RED)) {
			stepBuffer.append("z2");
			cubeModel.z2();
		} else if (cubeModel.getRight().getColor().equals(Color.RED)) {
			stepBuffer.append("z ");
			cubeModel.z();
		}
	}

	/**
	 * 翻棱
	 */
	private static void fileEdge() {
		// 记录需要翻的棱
		List<Character> flipEdgeCodeSet = new ArrayList<Character>();
		for (Edge edge : cubeModel.getEdges()) {
			if (edge.needFlip()) {
				flipEdgeCodeSet.add(edge.getPositionCode());
			}
		}
		if (flipEdgeCodeSet.size() > 0) {
			// 匹配翻棱对
			// 翻棱测次数
			int flipCount = flipEdgeCodeSet.size() % 4 == 0 ? flipEdgeCodeSet.size() / 4 : flipEdgeCodeSet.size() / 4 + 1;
			for (int i = 0; i < flipCount; i++) {
				int start = i * 4;
				if (flipEdgeCodeSet.size() - (i + 1) * 4 > 0) {
					// 翻四个
					char[] edgeCodes = new char[4];
					edgeCodes[0] = flipEdgeCodeSet.get(start++);
					edgeCodes[1] = flipEdgeCodeSet.get(start++);
					edgeCodes[2] = flipEdgeCodeSet.get(start++);
					edgeCodes[3] = flipEdgeCodeSet.get(start++);
				} else {
					// 翻两个
					char[] edgeCodes = new char[2];
					edgeCodes[0] = flipEdgeCodeSet.get(start++);
					edgeCodes[1] = flipEdgeCodeSet.get(start++);
				}
			}
		}
	}
	
	/**
	 * 翻棱
	 * @param edgeCodes
	 */
	private static void fileEdge(char[] edgeCodes) {

	}

	/**
	 * 翻角
	 */
	private static void fileHorn() {
	}
	
	
	private static int getNum(int idx) {
		char[] colorCharArray = colorQueue.toCharArray();
		return Integer.valueOf(colorCharArray[idx] + "");
	}
	
	public static void main(String[] args) {
		colorQueue = inputColorQueue();
		inputColor();
		buildCoordinate();
		System.out.println(new Gson().toJson(cubeModel));
	}
}
