package br.com.coordenadas.business;

import br.com.coordenadas.model.Posicao;

public class CoordenadasBO {

	public String calcularCoordenada(String command){
		
		Posicao p = new Posicao();
		String[] comandos = command.split("");
		for (int i = 0; i < comandos.length; i++) {
			if(comandos[i].equals("L")){
				turnLeft(p);
			} else if(comandos[i].equals("R")){
				turnRight(p);
			} else if(comandos[i].equals("M")){
				move(p);
			} else if(comandos[i].equals("U")){
				goUp(p);
			} else if(comandos[i].equals("D")){
				goDown(p);
			}
		}
		return p.toString();
	}
	
	private void turnLeft(Posicao posicao){
		if(posicao.getDirecao().equals("NORTE")){
			posicao.setDirecao("OESTE");
		} else if(posicao.getDirecao().equals("OESTE")){
			posicao.setDirecao("SUL");
		} else if(posicao.getDirecao().equals("SUL")){
			posicao.setDirecao("LESTE");
		} else if(posicao.getDirecao().equals("LESTE")){
			posicao.setDirecao("NORTE");
		}
	}
	
	private void turnRight(Posicao posicao){
		if(posicao.getDirecao().equals("NORTE")){
			posicao.setDirecao("LESTE");
		} else if(posicao.getDirecao().equals("LESTE")){
			posicao.setDirecao("SUL");
		} else if(posicao.getDirecao().equals("SUL")){
			posicao.setDirecao("OESTE");
		} else if(posicao.getDirecao().equals("OESTE")){
			posicao.setDirecao("NORTE");
		}
	}
	
	private void move(Posicao posicao){
		if(posicao.getDirecao().equals("NORTE")){
			posicao.setY(posicao.getY() + 1);
		} else if(posicao.getDirecao().equals("OESTE")){
			posicao.setX(posicao.getX() - 1);
		} else if(posicao.getDirecao().equals("SUL")){
			posicao.setY(posicao.getY() - 1);
		} else if(posicao.getDirecao().equals("LESTE")){
			posicao.setX(posicao.getX() + 1);
		}
	}
	
	private void goUp(Posicao posicao){
		posicao.setZ(posicao.getZ() + 1);
	}
	
	private void goDown(Posicao posicao){
		posicao.setZ(posicao.getZ() - 1);
	}
}
