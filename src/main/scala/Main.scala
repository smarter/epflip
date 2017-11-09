import de.sciss.synth.Ops._
import de.sciss.synth._
import de.sciss.synth.ugen._

object Main {
  def main(args: Array[String]): Unit = {
    val cfg = Server.Config()
    cfg.pickPort()
    Server.run(cfg) { s =>
      s.dumpOSC()
      play {
        val p = "pitch".kr(80f)
        val f = LFSaw.kr(0.4).madd(24, LFSaw.kr(Seq(8.0, 7.23)).madd(3, p)).midicps
        val a = CombN.ar(SinOsc.ar(f) * 0.04, 0.2, 0.2, 4)
        a
      }
    }
  }
}
