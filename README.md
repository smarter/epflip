## epflip

If `sbt run` does not produce sound, try setting the following environment variables (from https://github.com/Sciss/ScalaCollider/issues/76):

```shell
export SC_JACK_DEFAULT_INPUTS="system:capture_1,system:capture_2"
export SC_JACK_DEFAULT_OUTPUTS="system:playback_1,system:playback_2"
```
