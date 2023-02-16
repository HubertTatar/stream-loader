package com.adform.streamloader.sink.batch.storage

trait OffsetCompression
case object Without extends OffsetCompression
case object Zstd extends OffsetCompression
