package practiceGame;


import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;
import static practiceGame.world.BLOCK_SIZE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.lwjgl.util.vector.Vector4f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class Terrain {
	protected TerrainType type = TerrainType.AIR;
	private AnimationSequence Animation;
	private float x;
	private float y;
	int logicX;
	int logicY;
	int logicZ;
	protected world parent;
	protected int height = 32;
	protected int width = 32;
	public Terrain(TerrainType type, int x, int y, int z, world parent) {
		Animation = new AnimationSequence(type.location);
		this.type = type;
		this.logicX = x;
		this.logicY = y;
		this.logicZ = z;
		this.parent = parent;
		
	}
	public boolean walkThrough(Direction walkingDirection,unit unit){
		return true;
	}
	public void activate(Hero activatingPlayer){
		//parent.removeTerrain(this.logicX,this.logicY,this.logicZ);
	}
	public String getTextureID(){
		return null;
		
	}
	public TerrainType getType() {
		return type;
	}
	public void setType(TerrainType type) {
		this.type = type;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void render(){
		world.renderer.addRender(this.type.location, world.BLOCK_SIZE * this.logicX, world.BLOCK_SIZE*this.logicY , this.height, this.width,new Vector4f(0,0,1,1));
	}
}
