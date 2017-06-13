package br.com.coordenadas.model;

public class Posicao {

	private int X;
	private int Y;
	private int Z;
	private String direcao;
	
	public Posicao(){
		X = 0;
		Y = 0;
		Z = 0;
		direcao = "NORTE";
	}
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int z) {
		Z = z;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	
	public String toString(){
		return X + " " + Y + " " + Z + " " + direcao;
	}
}
