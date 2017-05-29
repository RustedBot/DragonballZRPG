package com.dragonballzrpg.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dragonballzrpg.DragonballZRPG;
import com.dragonballzrpg.ui.uielements.UIElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carl on 25/05/2017.
 */
public abstract class UI
{
    protected DragonballZRPG game;
    protected List<UIElement> uiElements;

    public UI()
    {
        uiElements = new ArrayList<UIElement>();
    }

    public UI(DragonballZRPG game)
    {
        this.game = game;
        uiElements = new ArrayList<UIElement>();
    }

    public void render(SpriteBatch batch)
    {
        for(UIElement uiElement : uiElements)
        {
            uiElement.render(batch);
        }
    }
}