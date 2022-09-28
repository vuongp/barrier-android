package work.vuong.barrierclient.barrrier

sealed class Event {
    data class MouseMove(val x: Int, val y: Int): Event()
    data class MouseDown(val buttonId: Byte): Event()
    data class MouseUp(val buttonId: Byte): Event()
}