package com.dragonballzrpg.states.playerstates;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dragonballzrpg.entities.Entity;
import com.dragonballzrpg.entities.players.Player;
import com.dragonballzrpg.enums.AnimationName;
import com.dragonballzrpg.enums.StateName;
import com.dragonballzrpg.states.State;
import com.dragonballzrpg.states.Transition;
import com.dragonballzrpg.states.TransitionCondition;

/**
 * Created by Carl on 24/08/2016.
 */
public class StandingState extends State
{
//    public StandingState(Player p)
//    {
//        transitions.add(new Transition(p.getPlayerStates().get(StateName.WALKING_RIGHT), new AnimationName[]{AnimationName.WALK_RIGHT},
//          new TransitionCondition[]
//            {
//              new TransitionCondition(p.isRightKeyPressed(), true)
//            }));
//    }

    @Override
    public void initialiseTransitions(Player p)
    {
        transitions.add(new Transition(p.getPlayerStates().get(StateName.WALKING_RIGHT), new AnimationName[]{AnimationName.WALK_RIGHT},
        new TransitionCondition[]
        {
            new TransitionCondition(p.isRightKeyPressed(), true)
        }));

//        transitions.add(new Transition(p.getPlayerStates().value(StateName.RUNNING_RIGHT), new AnimationName[]{AnimationName.RUN_RIGHT},
//        new TransitionCondition[]
//        {
//            new TransitionCondition(p.isRightKeyPressed(), true),
//            new TransitionCondition(p.isReadyToRunRight(), true)
//        }));
//
//        transitions.add(new Transition(p.getPlayerStates().value(StateName.MELEEING_RIGHT),
//                        new AnimationName[]{AnimationName.PUNCH_RIGHT_1, AnimationName.PUNCH_RIGHT_2, AnimationName.KICK_RIGHT},
//        new TransitionCondition[]
//        {
//            new TransitionCondition(p.isMKeyPressed(), true),
//            new TransitionCondition(p.canAttack(), true)
//        }));
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

//        if(((Player)entity).isRightKeyPressed().value())
//        {
//            ((Player)entity).setCurrentAnimation(((Player)entity).getAnimations().get(AnimationName.WALK_RIGHT));
//            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().get(StateName.WALKING_RIGHT));
//        }

        /*if(((Player)entity).isMKeyPressed() && ((Player)entity).canAttack) // For testing
        {
            ((Player)entity).canAttack = false;
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation(getRandomValue(new String[]{"punch1Right", "punch2Right", "kickRight"})));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("attackingRight"));
        }
        else if(((Player)entity).isUpKeyPressed() && ((Player)entity).isReadyToRunUp())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("runningUp"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("runningNorth"));
        }
        else if(((Player)entity).isDownKeyPressed() && ((Player)entity).isReadyToRunDown())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("runningDown"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("runningSouth"));
        }
        else if(((Player)entity).isLeftKeyPressed() && ((Player)entity).isReadyToRunLeft())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("runningLeft"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("runningWest"));
        }
        else if(((Player)entity).isRightKeyPressed() && ((Player)entity).isReadyToRunRight())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("runningRight"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("runningEast"));
        }
        else if(((Player)entity).isUpKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("walkingUp"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("walkingNorth"));
        }
        else if(((Player)entity).isDownKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("walkingDown"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("walkingSouth"));
        }
        else if(((Player)entity).isLeftKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("walkingLeft"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("walkingWest"));
        }
        else if(((Player)entity).isRightKeyPressed())
        {
            ((Player)entity).setCurrentAnimation(((Player)entity).getStringAnimations().getAnimation("walkingRight"));
            ((Player)entity).setCurrentState(((Player)entity).getPlayerStates().getAnimation("walkingEast"));
        }*/
    }

    @Override
    public void render(Entity entity, SpriteBatch batch)
    {

    }
}