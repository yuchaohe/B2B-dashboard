#!/bin/bash
echgit o "正在安装 git hooks..."

cp ../../../.trellis/spec/hook/pre-commit ../../../.git/hooks/pre-commit
chmod +x ../../../.git/hooks/pre-commit

echo "✅ 安装完git git 成！以后每次 git commit 都会自动校验权限"