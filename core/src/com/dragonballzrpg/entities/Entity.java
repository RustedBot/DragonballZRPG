package com.dragonballzrpg.entities;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Carl on 09/08/2016.
 */
public abstract class Entity
{
    public Vector2 position;
    protected double speed;
    protected float width;
    protected float height;
    protected AssetManager assetManager;
    protected Map<String, Sound> soundEffects;

    public Entity()
    {
        position = new Vector2(0, 0);
        soundEffects = new HashMap<String, Sound>();
        speed = 0.0d;
        width = 0.0f;
        height = 0.0f;
    }

    public abstract void update();
    public abstract void render(SpriteBatch batch);

    public double getSpeed()
    {
        return speed;
    }
}
