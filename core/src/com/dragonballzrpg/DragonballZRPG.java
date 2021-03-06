package com.dragonballzrpg;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.dragonballzrpg.enums.*;
import com.dragonballzrpg.screens.ControlsScreen;
import com.dragonballzrpg.screens.MainMenuScreen;
import com.dragonballzrpg.screens.PlayScreen;
import com.dragonballzrpg.utilities.ResourceManager;
import com.dragonballzrpg.utilities.SoundSystem;

import java.util.HashMap;
import java.util.Map;

public class DragonballZRPG extends Game
{
	private final int VIEWPORT_WIDTH = 240;
	private final int VIEWPORT_HEIGHT = 160;
	public ResourceManager resourceManager;
	public SoundSystem soundSystem;
	public Map<ScreenName, Screen> screens;
	public OrthographicCamera camera;
	public Viewport viewport;
	public Map<KeyName, Integer> inputKeyMap;

	@Override
	public void create()
	{
		resourceManager = new ResourceManager();
		resourceManager.loadResources(); // load resources first

		soundSystem = new SoundSystem(resourceManager);

		screens = new HashMap<ScreenName, Screen>();
		camera = new OrthographicCamera(VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
		viewport = new StretchViewport(VIEWPORT_WIDTH, VIEWPORT_HEIGHT, camera);

		inputKeyMap = new HashMap<KeyName, Integer>();

		initialiseInputKeys();
		initialiseScreens();
		initialiseCamera();
		initialiseViewport();
	}

	@Override
	public void render()
	{
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		super.render();
	}

	@Override
	public void dispose()
	{
		resourceManager.dispose();

		for(Screen screen : screens.values()) { screen.dispose(); }
	}

	@Override
	public void resize(int width, int height)
	{
		viewport.update(width, height);
	}

	private void initialiseInputKeys()
	{
		inputKeyMap.put(KeyName.UP_KEY, Input.Keys.UP);
		inputKeyMap.put(KeyName.DOWN_KEY, Input.Keys.DOWN);
		inputKeyMap.put(KeyName.LEFT_KEY, Input.Keys.LEFT);
		inputKeyMap.put(KeyName.RIGHT_KEY, Input.Keys.RIGHT);
		inputKeyMap.put(KeyName.INTERACT_OR_MELEE_KEY, Input.Keys.M);
		inputKeyMap.put(KeyName.CANCEL_OR_ENERGY_ATTACK_KEY, Input.Keys.N);
		inputKeyMap.put(KeyName.SWITCH_ENERGY_ATTACK_KEY, Input.Keys.B);
		inputKeyMap.put(KeyName.PAUSE_KEY, Input.Keys.SPACE);
		inputKeyMap.put(KeyName.SELECT_KEY, Input.Keys.ENTER);
	}

	private void initialiseScreens()
	{
		screens.put(ScreenName.MAIN_MENU_SCREEN, new MainMenuScreen(this));
		screens.put(ScreenName.PLAY_SCREEN, new PlayScreen(this));
		screens.put(ScreenName.CONTROLS_SCREEN, new ControlsScreen(this));

		//setScreen(screens.get(ScreenName.MAIN_MENU_SCREEN));
		setScreen(screens.get(ScreenName.PLAY_SCREEN));
		//setScreen(screens.get(ScreenName.CONTROLS_SCREEN));
	}

	private void initialiseCamera()
	{
		// Move the cameras bottom left corner from (0, 0) to half the VIEWPORT_WIDTH right and half the VIEWPORT_HEIGHT up
		camera.translate(VIEWPORT_WIDTH / 2, VIEWPORT_HEIGHT / 2);
	}

	private void initialiseViewport()
	{
		viewport.apply();
	}
}
