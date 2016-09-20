package com.dragonballzrpg.states.playerstates.walkingstates;

import com.badlogic.gdx.Gdx;
import com.dragonballzrpg.entities.Entity;
import com.dragonballzrpg.entities.animatedentities.players.Player;
import com.dragonballzrpg.states.State;

/**
 * Created by Carl on 24/08/2016.
 */
public class WalkingWest extends State
{
    @Override
    public void initialiseTransitions(Player p)
    {

    }

    @Override
    public void enter(Entity entity)
    {

    }

    @Override
    public void update(Entity entity)
    {
        // Up && Left
        /*if(((Player)entity).isUpKeyPressed() && !((Player)entity).isDownKeyPressed() &&
           ((Player)entity).isLeftKeyPressed() && !((Player)entity).isRightKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getAnimations().get("walkingLeft"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().get("walkingWestNorth"));
        }

        // Down && Left
        if(!((Player)entity).isUpKeyPressed() && ((Player)entity).isDownKeyPressed() &&
           ((Player)entity).isLeftKeyPressed() && !((Player)entity).isRightKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getAnimations().get("walkingLeft"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().get("walkingWestSouth"));
        }

        if(!((Player)entity).isLeftKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getAnimations().get("facingLeft"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().get("standing"));
        }*/

        ((Player)entity).position.x -= entity.getSpeed() * Gdx.graphics.getDeltaTime();
    }
}