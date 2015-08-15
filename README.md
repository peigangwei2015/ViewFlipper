# ViewFlipper
ViewFllipper图片切换


在Layout中布局加入ViewFlipper

在MainActivity中实例化


加载所有的图片资源

动态生成一个ImageView

将ImageView背景都设置为图片资源

将ImageView加入到ViewFlipper

ViewFlipper.addView();

添加动画
flipper.setInAnimation()
flipper.setOutAnimation()

设置切换的时间间隔
setFlipInterval(毫秒)

开始播放
flipper.startFlipping();


支持手势滑动

注册onTouchEvent

在Action_down中记录x值
在action_move中判断是向左划还是向右划

向右划
flipper.setInAnimation(left_in)
flipper.setOutAnimation(left_out)
flipper.showPrevious();前一页
flipper.showNext()后一页
