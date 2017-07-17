package com.dragonballzrpg.states.playerstates.facingstates;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dragonballzrpg.gameobjects.GameObject;
import com.dragonballzrpg.gameobjects.characters.Player;
import com.dragonballzrpg.states.State;
import com.dragonballzrpg.states.Transition;

/**
 * Created by Carl on 21/09/2016.
 */

//public class FacingRightState extends State
//{
//    @Override
//    public void initialiseTransitions(Player p)
//    {
////        transitions.add(new Transition(p.getPlayerStates().get("walkingNorth"), new String[]{"walkingUp"},
////        new TransitionCondition[]
////        {
////            new TransitionCondition(p.isUpKeyPressed(), true)
////        }));
////
////        transitions.add(new Transition(p.getPlayerStates().get("walkingSouth"), new String[]{"walkingDown"},
////        new TransitionCondition[]
////        {
////            new TransitionCondition(p.isDownKeyPressed(), true)
////        }));
////
////        transitions.add(new Transition(p.getPlayerStates().get("walkingWest"), new String[]{"walkingLeft"},
////        new TransitionCondition[]
////        {
////            new TransitionCondition(p.isLeftKeyPressed(), true)
////        }));
////
////        transitions.add(new Transition(p.getPlayerStates().get("walkingEast"), new String[]{"walkingRight"},
////        new TransitionCondition[]
////        {
////            new TransitionCondition(p.isRightKeyPressed(), true)
////        }));
////
////        transitions.add(new Transition(p.getPlayerStates().get("runningEast"), new String[]{"runningRight"},
////        new TransitionCondition[]
////        {
////            new TransitionCondition(p.isRightKeyPressed(), true),
////            new TransitionCondition(p.isReadyToRunRight(), true)
////        }));
////
////        transitions.add(new Transition(p.getPlayerStates().get("meleeingEast"), new String[]{"punch1Right", "punch2Right", "kickRight"},
////        new TransitionCondition[]
////        {
////            new TransitionCondition(p.getMKeyPressed(), true),
////            new TransitionCondition(p.getCanAttack(), true)
////        }));
//    }
//
//    @Override
//    public void enter(GameObject gameObject)
//    {
//
//    }
//
//    @Override
//    public void exit(GameObject gameObject)
//    {
//
//    }
//
//    @Override
//    public void update(GameObject gameObject)
//    {
//        for(Transition transition : transitions)
//        {
//            transition.update((Player) gameObject);
//        }
//    }
//
//    @Override
//    public void render(GameObject gameObject, SpriteBatch batch)
//    {
//        //batch.draw(((Player)gameObject).currentAnimation.getCurrentFrame(), (int)gameObject.position.x, (int)gameObject.position.y);
////        batch.draw(((Player)gameObject).currentAnimation.getCurrentFrame(),
////        (int)((Player)gameObject).position.x - ((Player)gameObject).currentAnimation.getCurrentFrame().getRegionWidth() / 2,
////        ((Player)gameObject).position.y - ((Player)gameObject).currentAnimation.getCurrentFrame().getRegionHeight() / 2.0f);
//    }
//}
