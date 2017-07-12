package com.dragonballzrpg.utilities;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;

/**
 * Created by Carl on 12/07/2017.
 */
public class GameAssetManager
{
    private AssetManager assetManager;

    public GameAssetManager()
    {
        assetManager = new AssetManager();
    }

    public <T> T get(String filename)
    {
        return assetManager.get(filename);
    }

    public <T> T get(String filename, Class<T> type)
    {
        return assetManager.get(filename, type);
    }

    public void loadAssets()
    {
        loadFonts();
        loadTextures();
        loadSounds();

        assetManager.finishLoading();
    }

    private void loadFonts()
    {
        FileHandleResolver fileHandleResolver = new InternalFileHandleResolver();
        assetManager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(fileHandleResolver));
        assetManager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(fileHandleResolver));

        FreetypeFontLoader.FreeTypeFontLoaderParameter parameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
        parameter.fontFileName = "fonts/FreeSans.ttf";
        parameter.fontParameters.size = 36;
        assetManager.load("FreeSans36.ttf", BitmapFont.class, parameter);
    }

    private void loadTextures()
    {
        assetManager.load("spritesheets/futuretrunks/teenFutureTrunks.png", Texture.class);
    }

    private void loadSounds()
    {
        assetManager.load("sounds/melee1.wav", Sound.class);
        assetManager.load("sounds/melee2.wav", Sound.class);
        assetManager.load("sounds/running.wav", Sound.class);
    }

    public void dispose()
    {
        assetManager.dispose();
    }
}
