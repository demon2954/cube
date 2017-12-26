package brind.cube.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 魔方模型
 * 一个还原的魔方，黄色为顶，红色为前的坐标<br>
 * 面朝顶面，棱，最底块开始顺时针1,2,3,4。角，左下角开始顺时针 1,2,3,4<br>
 * 面朝底面，棱，最顶块开始逆时针5,6,7,8。角，左上角开始逆时针5,6,7,8<br>
 * 面朝左面，棱，右棱9 左棱0<br>
 * 面朝右面，棱，左棱a 右棱1<br>
 * 
 * 使用时，以位置记录颜色，如1号棱的位置为红蓝，则edge_1.colorTop=红，edge_1.colorDown=蓝
 * @author zone
 * @date 2017-12-08
 */
@Data
public class CubeModel {
	// 棱序列 
	private Edge edge_1;
	private Edge edge_2;
	private Edge edge_3;
	private Edge edge_4;
	private Edge edge_5;
	private Edge edge_6;
	private Edge edge_7;
	private Edge edge_8;
	private Edge edge_9;
	private Edge edge_0;
	private Edge edge_a;
	private Edge edge_r;//缓冲块
	
	// 角序列 
	private Horn horn_1;
	private Horn horn_2;
	private Horn horn_3;
	private Horn horn_4;//缓冲块
	private Horn horn_5;
	private Horn horn_6;
	private Horn horn_7;
	private Horn horn_8;
	
	// 中心块
	private Center top;
	private Center down;
	private Center front;
	private Center back;
	private Center left;
	private Center right;
	
	/**
	 * 顺时针旋转x轴
	 */
	public CubeModel x() {
		//替换角
		Horn tempHorn_1 = horn_1;
		Horn tempHorn_2 = horn_2;
		Horn tempHorn_3 = horn_3;
		Horn tempHorn_4 = horn_4;
		Horn tempHorn_5 = horn_5;
		Horn tempHorn_6 = horn_6;
		Horn tempHorn_7 = horn_7;
		Horn tempHorn_8 = horn_8;

		horn_1 = tempHorn_5;
		horn_2 = tempHorn_6;
		horn_3 = tempHorn_2;
		horn_4 = tempHorn_1;
		horn_5 = tempHorn_8;
		horn_6 = tempHorn_7;
		horn_7 = tempHorn_3;
		horn_8 = tempHorn_4;
		
		// 替换棱
		Edge tempEdge_1 = edge_1;
		Edge tempEdge_2 = edge_2;
		Edge tempEdge_3 = edge_3;
		Edge tempEdge_4 = edge_4;
		Edge tempEdge_5 = edge_5;
		Edge tempEdge_6 = edge_6;
		Edge tempEdge_7 = edge_7;
		Edge tempEdge_8 = edge_8;
		Edge tempEdge_9 = edge_9;
		Edge tempEdge_0 = edge_0;
		Edge tempEdge_a = edge_a;
		Edge tempEdge_r = edge_r;
		edge_1 = tempEdge_3;
		edge_2 = tempEdge_6;
		edge_3 = tempEdge_0;
		edge_4 = tempEdge_2;
		edge_5 = tempEdge_a;
		edge_6 = tempEdge_8;
		edge_7 = tempEdge_1;
		edge_8 = tempEdge_4;
		edge_9 = tempEdge_5;
		edge_0 = tempEdge_7;
		edge_a = tempEdge_r;
		edge_r = tempEdge_9;

		// 替换中心块
		Center temp_top = top;
		Center temp_down = down;
		Center temp_front = front;
		Center temp_back = back;
		Center temp_left = left;
		Center temp_right = right;
		top = temp_left;
		down = temp_right;
		front = temp_front;
		back = temp_back;
		left = temp_down;
		right = temp_top;
		
		return this;
	}
	/**
	 * 顺时针旋转y轴
	 */
	public CubeModel y() {
		//替换角
		Horn tempHorn_1 = horn_1;
		Horn tempHorn_2 = horn_2;
		Horn tempHorn_3 = horn_3;
		Horn tempHorn_4 = horn_4;
		Horn tempHorn_5 = horn_5;
		Horn tempHorn_6 = horn_6;
		Horn tempHorn_7 = horn_7;
		Horn tempHorn_8 = horn_8;

		horn_1 = tempHorn_5;
		horn_2 = tempHorn_1;
		horn_3 = tempHorn_4;
		horn_4 = tempHorn_8;
		horn_5 = tempHorn_6;
		horn_6 = tempHorn_2;
		horn_7 = tempHorn_3;
		horn_8 = tempHorn_7;
		
		// 替换棱
		Edge tempEdge_1 = edge_1;
		Edge tempEdge_2 = edge_2;
		Edge tempEdge_3 = edge_3;
		Edge tempEdge_4 = edge_4;
		Edge tempEdge_5 = edge_5;
		Edge tempEdge_6 = edge_6;
		Edge tempEdge_7 = edge_7;
		Edge tempEdge_8 = edge_8;
		Edge tempEdge_9 = edge_9;
		Edge tempEdge_0 = edge_0;
		Edge tempEdge_a = edge_a;
		Edge tempEdge_r = edge_r;
		edge_1 = tempEdge_4;
		edge_2 = tempEdge_9;
		edge_3 = tempEdge_r;
		edge_4 = tempEdge_a;
		edge_5 = tempEdge_7;
		edge_6 = tempEdge_0;
		edge_7 = tempEdge_3;
		edge_8 = tempEdge_1;
		edge_9 = tempEdge_6;
		edge_0 = tempEdge_2;
		edge_a = tempEdge_8;
		edge_r = tempEdge_5;

		// 替换中心块
		Center temp_top = top;
		Center temp_down = down;
		Center temp_front = front;
		Center temp_back = back;
		Center temp_left = left;
		Center temp_right = right;
		top = temp_front;
		down = temp_back;
		front = temp_down;
		back = temp_top;
		left = temp_left;
		right = temp_right;
		
		return this;
	}
	/**
	 * 顺时针旋转z轴
	 */
	public CubeModel z() {
		//替换角
		Horn tempHorn_1 = horn_1;
		Horn tempHorn_2 = horn_2;
		Horn tempHorn_3 = horn_3;
		Horn tempHorn_4 = horn_4;
		Horn tempHorn_5 = horn_5;
		Horn tempHorn_6 = horn_6;
		Horn tempHorn_7 = horn_7;
		Horn tempHorn_8 = horn_8;

		horn_1 = tempHorn_4;
		horn_2 = tempHorn_1;
		horn_3 = tempHorn_2;
		horn_4 = tempHorn_3;
		horn_5 = tempHorn_8;
		horn_6 = tempHorn_5;
		horn_7 = tempHorn_6;
		horn_8 = tempHorn_7;
		
		// 替换棱
		Edge tempEdge_1 = edge_1;
		Edge tempEdge_2 = edge_2;
		Edge tempEdge_3 = edge_3;
		Edge tempEdge_4 = edge_4;
		Edge tempEdge_5 = edge_5;
		Edge tempEdge_6 = edge_6;
		Edge tempEdge_7 = edge_7;
		Edge tempEdge_8 = edge_8;
		Edge tempEdge_9 = edge_9;
		Edge tempEdge_0 = edge_0;
		Edge tempEdge_a = edge_a;
		Edge tempEdge_r = edge_r;
		edge_1 = tempEdge_0;
		edge_2 = tempEdge_r;
		edge_3 = tempEdge_2;
		edge_4 = tempEdge_3;
		edge_5 = tempEdge_8;
		edge_6 = tempEdge_5;
		edge_7 = tempEdge_6;
		edge_8 = tempEdge_7;
		edge_9 = tempEdge_a;
		edge_0 = tempEdge_9;
		edge_a = tempEdge_1;
		edge_r = tempEdge_4;

		// 替换中心块
		Center temp_top = top;
		Center temp_down = down;
		Center temp_front = front;
		Center temp_back = back;
		Center temp_left = left;
		Center temp_right = right;
		top = temp_top;
		down = temp_down;
		front = temp_right;
		back = temp_left;
		left = temp_front;
		right = temp_back;
		
		return this;
	}
	
	/**
	 * 逆时针旋转x轴
	 */
	public CubeModel xv() {
		return x().x().x();
	}
	/**
	 * 逆时针旋转y轴
	 */
	public CubeModel yv() {
		return y().y().y();
	}
	/**
	 * 逆时针旋转z轴
	 */
	public CubeModel zv() {
		return z().z().z();
	}
	
	/**
	 * x2
	 */
	public CubeModel x2() {
		return x().x();
	}
	/**
	 * y2
	 */
	public CubeModel y2() {
		return y().y();
	}
	/**
	 * z2
	 */
	public CubeModel z2() {
		return z().z();
	}

	public List<Horn> getHorns() {
		List<Horn> horns = new ArrayList<Horn>();
		horns.add(horn_1);
		horns.add(horn_2);
		horns.add(horn_3);
		horns.add(horn_4);
		horns.add(horn_5);
		horns.add(horn_6);
		horns.add(horn_7);
		horns.add(horn_8);
		return horns;
	}

	public List<Edge> getEdges() {
		List<Edge> edges = new ArrayList<Edge>();
		edges.add(edge_0);
		edges.add(edge_1);
		edges.add(edge_2);
		edges.add(edge_3);
		edges.add(edge_4);
		edges.add(edge_5);
		edges.add(edge_6);
		edges.add(edge_7);
		edges.add(edge_8);
		edges.add(edge_9);
		edges.add(edge_a);
		edges.add(edge_r);
		return edges;
	}

	public List<Center> getCenters() {
		List<Center> centers = new ArrayList<Center>();
		centers.add(left);
		centers.add(back);
		centers.add(down);
		centers.add(front);
		centers.add(right);
		centers.add(top);
		return centers;
	}
}
