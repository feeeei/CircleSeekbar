## CircleSeekbar 
[![Build Status](https://travis-ci.org/feeeei/CircleSeekbar.svg?branch=master)](https://travis-ci.org/feeeei/CircleSeekbar)
[![API](https://img.shields.io/badge/API-7%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=7)
[![JitPack](https://jitpack.io/v/feeeei/CircleSeekbar.svg)](https://jitpack.io/#feeeei/CircleSeekbar)


an android circle seekbar library

<img src="https://github.com/feeeei/CircleSeekbar/blob/master/gifs/style1.gif" width="220"/>
<img src="https://github.com/feeeei/CircleSeekbar/blob/master/gifs/style2.gif" width="220"/>
<img src="https://github.com/feeeei/CircleSeekbar/blob/master/gifs/withshadow.gif" width="220"/>
<img src="https://github.com/feeeei/CircleSeekbar/blob/master/gifs/withtext.gif" width="220"/>
<img src="https://github.com/feeeei/CircleSeekbar/blob/master/gifs/download.gif" width="220"/>
<img src="https://github.com/feeeei/CircleSeekbar/blob/master/gifs/union.gif" width="220"/>

## quick start
#### 1.Add root build.gradle
```
 repositories {
        // ...
        maven { url "https://jitpack.io" }
 }
```
#### 2.Add build.gradle
```
dependencies {
	        compile 'com.github.feeeei:CircleSeekbar:v1.1.2'
	}
```
#### 3.Added to the XML
```
    <io.feeeei.circleseekbar.CircleSeekBar
        android:id="@+id/seekbar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:wheel_max_process="100"
        />
```

## attrs
```
  <!-- process -->
  <attr name="wheel_max_process" format="integer" />
  <attr name="wheel_cur_process" format="integer" />
  
  <!-- reached style -->
  <attr name="wheel_reached_color" format="color" />
  <attr name="wheel_reached_width" format="dimension" />
  
  <!-- unReached style -->
  <attr name="wheel_unreached_color" format="color" />
  <attr name="wheel_unreached_width" format="dimension" />
  
  <!-- pointer style -->
  <attr name="wheel_pointer_color" format="color" />
  <attr name="wheel_pointer_radius" format="dimension" />
  
  <!--shadows style -->
  <attr name="wheel_has_pointer_shadow" format="boolean" />
  <attr name="wheel_has_wheel_shadow" format="boolean" />
  <attr name="wheel_pointer_shadow_radius" format="dimension" />
  <attr name="wheel_shadow_radius" format="dimension" />
  
  <!-- if you want to open the wheel shadow, open this can speed up the rendering speed -->
  <attr name="wheel_has_cache" format="boolean" />
  
  <!-- if you want to block touchListener,use like processBar,
   only allow the code to control the schedule, you can change this attribute to false -->
  <attr name="wheel_can_touch" format="boolean" />    
  
  <attr name="wheel_scroll_only_one_circle" format="boolean" />
```

## License
#### PGSL 
please give me star license

