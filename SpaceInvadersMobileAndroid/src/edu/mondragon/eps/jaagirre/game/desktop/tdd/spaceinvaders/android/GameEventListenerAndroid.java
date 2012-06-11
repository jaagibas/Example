package edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders.android;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders.Game;


public class GameEventListenerAndroid implements OnClickListener{

	Game game;
	
	
	public GameEventListenerAndroid(Game game) {
		super();
		this.game = game;
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		System.out.println("Click");
		switch( v.getId() ){
			case  R.id.buttonDown:
				game.getGameLogic().getPlayer().moveDown();
				break;
			case R.id.buttonUp:
				game.getGameLogic().getPlayer().moveUp();
				break;
			case R.id.buttonRight:
				game.getGameLogic().getPlayer().moveRight();
				break;
			case R.id.buttonLeft:
				game.getGameLogic().getPlayer().moveLeft();
				break;
			case R.id.buttonFire:
				game.getGameLogic().getPlayer().fire();
				break;
			default:
				break;
		
		}
	}


}
