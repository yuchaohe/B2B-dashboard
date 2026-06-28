#!/bin/bash
echo "正在安装 git hooks..."
# 把项目里的 pre-commit 脚本链到 .git/hooks/ 下
ln -sf "../../.trellis/spec/hook/pre-commit" .git/hooks/pre-commit

echo "✅ 安装完成！以后每次 git commit 都会自动校验权限"