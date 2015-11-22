## CircleSeekbar
an android circle seekbar library

----
![](https://github.com/feeeei/CircleSeekbar/blob/master/gifs/style1.gif)![](https://github.com/feeeei/CircleSeekbar/blob/master/gifs/style2.gif)![](https://github.com/feeeei/CircleSeekbar/blob/master/gifs/withshadow.gif)![](https://github.com/feeeei/CircleSeekbar/blob/master/gifs/withtext.gif)![](https://github.com/feeeei/CircleSeekbar/blob/master/gifs/download.gif)![](https://github.com/feeeei/CircleSeekbar/blob/master/gifs/union.gif)

----

## quick start
####1.Add root build.gradle
```
 repositories {
        // ...
        maven { url "https://jitpack.io" }
 }
```
####2.Add build.gradle
```
dependencies {
	        compile 'com.github.feeeei:CircleSeekbar:v1.0.1'
	}
```
####3.Added to the XML
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
  <b><attr name="wheel_max_process" format="integer" /></b>
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
  
  <!-- If you want to open the wheel shadow, open this can speed up the rendering speed -->
  <attr name="wheel_has_cache" format="boolean" />
  
  <!-- If you want to block touchListener, only allow the code to control the schedule, you can change this attribute to false -->
  <attr name="wheel_can_touch" format="boolean" />    
```

##License
####PGSL
  please give me star license

