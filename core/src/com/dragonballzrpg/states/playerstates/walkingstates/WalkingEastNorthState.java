package com.dragonballzrpg.states.playerstates.walkingstates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dragonballzrpg.entities.Entity;
import com.dragonballzrpg.entities.animatedentities.players.Player;
import com.dragonballzrpg.states.State;
import com.dragonballzrpg.states.Transition;
import com.dragonballzrpg.states.TransitionCondition;

/**
 * Created by Carl on 30/08/2016.
 */
public class WalkingEastNorthState extends State
{
    @Override
    public void initialiseTransitions(Player p)
    {
        transitions.add(new Transition(p.getPlayerStates().get("facingEast"), new String[]{"facingRight"},
        new TransitionCondition[]
        {
            new TransitionCondition(p.getUpKeyPressed(), false),
            new TransitionCondition(p.getRightKeyPressed(), false)
        }));

        transitions.add(new Transition(p.getPlayerStates().get("walkingNorth"), new String[]{"walkingUp"},
        new TransitionCondition[]
        {
            new TransitionCondition(p.getUpKeyPressed(), true),
            new TransitionCondition(p.getRightKeyPressed(), false)
        }));

        transitions.add(new Transition(p.getPlayerStates().get("walkingEast"), new String[]{"walkingRight"},
        new TransitionCondition[]
        {
            new TransitionCondition(p.getUpKeyPressed(), false),
            new TransitionCondition(p.getRightKeyPressed(), true)
        }));
    }

    @Override
    public void enter(Entity entity)
    {

    }

    @Override
    public void exit(Entity entity)
    {

    }

    @Override
    public void update(Entity entity)
    {
        for(Transition transition : transitions)
        {
            transition.update((Player)entity);
        }

        ((Player)entity).position.x += entity.getSpeed() * Gdx.graphics.getDeltaTime();
        ((Player)entity).position.y += entity.getSpeed() * Gdx.graphics.getDeltaTime();
    }

    @Override
    public void render(Entity entity, SpriteBatch batch)
    {

    }
}