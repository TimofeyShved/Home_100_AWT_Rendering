# Rendering

Методы улучшения визуализации

Визуализацию (rendering) созданной графики можно усовершенствовать, установив один из методов (hint) улучшения одним из методов класса Graphics2D:

setRenderingHints(RenderingHints.Key key, Object value) 

setRenderingHints(Map hints)

Ключи — методы улучшения — и их значения задаются константами класса RenderingHints

---------------------------------------------------------

Метод & Значение

---------------------------------------------------------

KEY_ANTIALIASING
---------------------------------------------------------

Размывание крайних пикселов линий для гладкости изображения; три значения, задаваемые константами

VALUE ANTIALIAS DEFAULT, VALUE ANTIALIAS ON, VALUE~ANTIALIAS OFF

---------------------------------------------------------

KEY_TEXT_ANTTALIAS ING
---------------------------------------------------------

To же для текста. Константы:

VALUE TEXT ANTIALIASING_DEFAULT, VALUE TEXT ANTIALIASING ON, VALUE_TEXT_ANTIALIASING_OFF

---------------------------------------------------------

KEY RENDERING
---------------------------------------------------------

Три типа визуализации. Константы:

VALUE RENDER SPEED, VALUE RENDER QUALITY, VALUE RENDER DEFAULT

---------------------------------------------------------

KEY COLOR RENDERING
---------------------------------------------------------

To же для цвета. Константы:

VALUE COLOR RENDER_SPEED, VALUE COLOR RENDER QUALITY, VALUE COLOR RENDER DEFAULT

---------------------------------------------------------

KEY ALPHA INTERPOLATION
---------------------------------------------------------

Плавное сопряжение линий. Константы:

VALUE ALPHA INTERPOLATION_SPEED, VALUE ALPHA INTERPOLATION QUALITY, VALUE_ALPHA_INTERPOLATION_DEFAULT

---------------------------------------------------------

KEY_INTERPOLATION
---------------------------------------------------------

Способы сопряжения. Константы:

VALUE_INTERPOLATION_BILINEAR, VALUE INTERPOLATION BICUBIC, VALUE INTERPOLATION_NEAREST_NEIGHBOR

---------------------------------------------------------

KEY_DITHERING
---------------------------------------------------------

Замена близких цветов. Константы:

VALUE DITHER ENABLE, VALUE DITHER DISABLE, VALUE DITHER DEFAULT

---------------------------------------------------------

He все графические системы обеспечивают выполнение этих методов, поэтому задание указанных атрибутов не означает, что определяемые ими методы будут применяться на самом деле.

Вот как может выглядеть начало метода paint () с указанием методов улучшения визуализации:

public void paint(Graphics gr){ 

Graphics2D g = (Graphics2D)gr; 

g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

RenderingHints.VALUE_ANTIALIAS_ON); 

g.setRenderingHint(RenderingHints.KEY_RENDERING,

RenderingHints.VALUE_RENDER_QUALITY); 

// Продолжение метода 

}
