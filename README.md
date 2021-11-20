Kotlin i18n support library
=======

This is a Kotlin version of Takahiko Kawasaki's [i18n library](https://github.com/TakahikoKawasaki/nv-i18n)

Complemented with a DialCode enum that is missing from the original library.

Compile
--------

    ./gradlew

Overview
--------

Package to support internationalization, containing ISO 3166-1 country code enum,
ISO 639-1 language code enum, ISO 15924 script code enum, etc.

| Class                | Description                                                  |
|:---------------------|:-------------------------------------------------------------|
| `CountryCode`        | ISO 3166-1 country code.                                     |
| `LanguageCode`       | ISO 639-1 language code.                                     |
| `LanguageAlpha3Code` | ISO 639-2 language code.                                     |
| `LocaleCode`         | Available locales whose format match either 'xx' or 'xx-XX'. |
| `ScriptCode`         | ISO 15924 script code.                                       |
| `CurrencyCode`       | ISO 4217 currency code.                                      |


License
-------

  Apache License, Version 2.0

See Also
--------

* [nv-i18n @ GitHub](https://github.com/TakahikoKawasaki/nv-i18n)
* Country Code [ISO 3166-1](http://en.wikipedia.org/wiki/ISO_3166-1)
* Country Code [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
* Country Code [ISO 3166-1 alpha-3](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)
* Country Code [ISO 3166-1 numeric](http://en.wikipedia.org/wiki/ISO_3166-1_numeric)
* Language Code [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
* Language Alpha3 Code [ISO 639-2](http://en.wikipedia.org/wiki/ISO_639-2)
* Script Code [ISO 15924](http://en.wikipedia.org/wiki/ISO_15924)
* Currency Code [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)
