/*
 * Copyright (c) 2000-2004 by JetBrains s.r.o. All Rights Reserved.
 * Use is subject to license terms.
 */
package com.intellij.openapi.roots;

import com.intellij.openapi.vfs.VirtualFile;

/**
 *  @author dsl
 */
public interface ModuleFileIndex extends FileIndex {
  OrderEntry getOrderEntryForFile(VirtualFile fileOrDir);

  OrderEntry[] getOrderEntriesForFile(VirtualFile fileOrDir);
}
